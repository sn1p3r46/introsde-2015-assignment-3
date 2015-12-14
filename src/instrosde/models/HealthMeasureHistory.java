package introsde.models;

import introsde.dao.LifeCoachDb_Dao;

import java.util.Date;
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
	}
