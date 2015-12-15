package introsde.models;

import introsde.dao.LifeCoachDb_Dao;

import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "LifeStatus")
@NamedQueries({
	@NamedQuery(name = "LifeStatus.findAll", query = "SELECT l FROM LifeStatus l"),
	//@NamedQuery(name="LifeStatus.findLifeStatusByMeasureDefinitionAndPerson", query="SELECT ls FROM LifeStatus ls WHERE ls.person = ?1 AND ls.measureDefinition = ?2")
})
public class LifeStatus{

	@Id
	@ManyToOne
	@JoinColumn(name="idMeasureHistory", referencedColumnName="idMeasureHistory")
	private HealthMeasureHistory healthMeasureHistory;

  @ManyToOne
  @JoinColumn(name="idPerson", referencedColumnName="idPerson")
  private Person person;

  @ManyToOne
  @JoinColumn(name="idMeasureDefinition", referencedColumnName="idMeasureDefinition")
  private MeasureDefinition measureDefinition;

  @Column(name="measureName")
  private String measureName;

  @Column(name="value")
  private String value;

	@Temporal(TemporalType.DATE)  							// indicates to the persistency manager that this is a Date field
  @Column(name="timestamp")
  private Date timestamp;

  public static List<LifeStatus> getAll() {
		EntityManager em = LifeCoachDb_Dao.instance.createEntityManager();
	  List<LifeStatus> list = em.createNamedQuery("LifeStatus.findAll", LifeStatus.class).getResultList();
	  LifeCoachDb_Dao.instance.closeConnections(em);
	  return list;
	}

	@XmlTransient
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}

	@XmlTransient
	public MeasureDefinition getMeasureDefinition() {
		return measureDefinition;
	}


	public void setMeasureDefinition(MeasureDefinition measureDefinition) {
		this.measureDefinition = measureDefinition;
	}


	public String getMeasureName() {
		return measureName;
	}


	public void setMeasureName(String measureName) {
		this.measureName = measureName;
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
}
