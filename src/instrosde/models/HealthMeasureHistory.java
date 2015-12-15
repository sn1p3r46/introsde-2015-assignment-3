package introsde.models;

import introsde.dao.LifeCoachDb_Dao;

import static java.lang.Math.toIntExact;
import java.util.Date;
import java.sql.Timestamp;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="HealthMeasureHistory")
@NamedQueries({
	@NamedQuery(name="HealthMeasureHistory.findAll", query="SELECT h FROM HealthMeasureHistory h"),
	@NamedQuery(name="HealthMeasureHistory.findByMeasureAndPerson", query="SELECT hmh FROM HealthMeasureHistory hmh WHERE hmh.person = ?1 AND hmh.measureDefinition = ?2"),
	@NamedQuery(name="HealthMeasureHistory.findByPidAndMid", query="SELECT hmh FROM HealthMeasureHistory hmh WHERE hmh.person = ?1 AND hmh.idMeasureHistory = ?2"),
	@NamedQuery(name="HealthMeasureHistory.findMeasureByDate", query="SELECT hmh FROM HealthMeasureHistory hmh WHERE hmh.person = ?1 AND hmh.measureDefinition = ?2 "
	+ "AND hmh.timestamp BETWEEN ?4 AND ?3")
})
public class HealthMeasureHistory{

    @Id
    @GeneratedValue(
    strategy = GenerationType.AUTO,                      // Indicates that the persistence provider should pick an appropriate strategy for the particular database.
    generator="sqlite_hmh_id_generator")                 // generator="sqlite_measure_definition_id_generator" must match the name of the @TableGenerator tag
    @TableGenerator(name="sqlite_hmh_id_generator",      // the name of the generator
        table="sqlite_sequence",                         // the name of the table where are stored sequences values
          pkColumnName="name",                           // name of the primary key (Optional)
        valueColumnName="seq",                           // the Column containing the actual value of the counter
          pkColumnValue="HealthMeasureHistory",          // the name of the Column related to the sequence to autoincrement
        allocationSize=1								 // Increments the cointer by one during the insertion
        )
    @Column(name="idMeasureHistory")
    private int idMeasureHistory;

    @Column(name="value")
    private String value;

		@Temporal(TemporalType.DATE)
    @Column(name="timestamp")
    private Date timestamp;

		@ManyToOne
		@JoinColumn( name = "idPerson", referencedColumnName = "idPerson")
    private Person person;

    @ManyToOne
	  @JoinColumn(name="idMeasureDefinition", referencedColumnName="idMeasureDefinition")
    private MeasureDefinition measureDefinition;

		public int getIdMeasureHistory() {
			return idMeasureHistory;
		}


		public void setIdMeasureHistory(int idMeasureHistory) {
			this.idMeasureHistory = idMeasureHistory;
		}


		public String getValue() {
			return value;
		}


		public void setValue(String value) {
			this.value = value;
		}


		public Date getTimestamp() {
			return timestamp;
		}


		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}


		public Person getPerson() {
			return person;
		}


		public void setPerson(Person person) {
			this.person = person;
		}


		public MeasureDefinition getMeasureDefinition() {
			return measureDefinition;
		}


		public void setMeasureDefinition(MeasureDefinition measureDefinition) {
			this.measureDefinition = measureDefinition;
		}


		public static List<HealthMeasureHistory> getAll() {
			EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
	    List<HealthMeasureHistory> list = em.createNamedQuery("HealthMeasureHistory.findAll", HealthMeasureHistory.class).getResultList();
	    LifeCoachDb_Dao.instance.closeConnections(em);
	    return list;
		}

		// Save Or Update
		public static HealthMeasureHistory saveHealthMeasureHistory(HealthMeasureHistory hmh) {
			EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			hmh=em.merge(hmh);
			tx.commit();
		  LifeCoachDb_Dao.instance.closeConnections(em);
		  return hmh;
		}
		// removes the entity from the DB
		public static void removeHealthMeasureHistory(HealthMeasureHistory hmh) {
			EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
	    hmh=em.merge(hmh);
	    em.remove(hmh);
	    tx.commit();
	    LifeCoachDb_Dao.instance.closeConnections(em);
		}

		public static List<HealthMeasureHistory> readPersonHistory(Long id, String measureType){
			Person p = Person.getPersonById(toIntExact(id));
			MeasureDefinition md = MeasureDefinition.getMeasureDefinitionByName(measureType);
			if(p==null || md == null){
				return null;
			}
			EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
			TypedQuery<HealthMeasureHistory> query = em.createNamedQuery("HealthMeasureHistory.findByMeasureAndPerson", HealthMeasureHistory.class);
			query.setParameter(1, p);
			query.setParameter(2, md);
			List<HealthMeasureHistory> list = query.getResultList();
			LifeCoachDb_Dao.instance.closeConnections(em);
			return list;
		}

		public static HealthMeasureHistory getHealthMeasureHistoryByPidAndMid(Long idPerson,String measureType, int mid) {
			EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
			Person p = Person.getPersonById(toIntExact(idPerson));

			TypedQuery<HealthMeasureHistory> query = em.createNamedQuery("HealthMeasureHistory.findByPidAndMid", HealthMeasureHistory.class);
			query.setParameter(1, p);
			query.setParameter(2, mid);

			List<HealthMeasureHistory> hmh = query.getResultList();

			LifeCoachDb_Dao.instance.closeConnections(em);

			HealthMeasureHistory hmhNonList = hmh.get(0);
			if(hmhNonList!=null && hmhNonList.getMeasureDefinition().getMeasureName().equals(measureType)){
					return hmhNonList;
			} else {
				System.out.println("INCONSISTENCY IN PARAMETERS GIVEN EXACTLY BETWEEN MID AND MEASURE NAME");
				return null;
			}
		}

		public static HealthMeasureHistory savePersonMeasure(Long id, HealthMeasureHistory hmh){
			Person p = Person.getPersonById(toIntExact(id));
			if(p!=null){
				Date date = new Date();
				Timestamp ts = new Timestamp(date.getTime());
				hmh.setTimestamp(ts);
				hmh.setPerson(p);
				hmh = HealthMeasureHistory.saveHealthMeasureHistory(hmh);
				return hmh;
			}
			return null;
		}

		// actually this method is the same of savePersonMeasure.. because the DB FUNCTION IS THE SAME BOTH FOR SAVING OR UPDATING.. :)
		public static HealthMeasureHistory updatePersonMeasure(Long id, HealthMeasureHistory hmh){
			Person p = Person.getPersonById(toIntExact(id));
			if(p!=null){
				Date date = new Date();
				Timestamp ts = new Timestamp(date.getTime());
				hmh.setTimestamp(ts);
				hmh.setPerson(p);
				return HealthMeasureHistory.saveHealthMeasureHistory(hmh);
			}
			return null;
		}
	}
