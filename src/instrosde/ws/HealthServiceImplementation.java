package introsde.ws;

import static java.lang.Math.toIntExact;

import javax.jws.WebService;
import java.util.List;

import introsde.models.Person;
import introsde.models.HealthMeasureHistory;
import introsde.models.MeasureDefinition;


@WebService(endpointInterface = "introsde.ws.HealthServiceInterface")
public class HealthServiceImplementation implements HealthServiceInterface{

  // M #1
  @Override
  public List<Person> readPersonList(){
    return Person.getAllPeople();
  }
  // M #2
  @Override
  public Person readPerson(Long id){
    return Person.getPersonById(toIntExact(id));
  }
  // M #3
  @Override
  public Person updatePerson(Person p){
    //p.setHealthMeasureHistory(null);
    Person per = Person.getPersonById(p.getIdPerson());
    per.setFirstname(p.getFirstname());
    per.setLastname(p.getLastname());
    per.setBirthday(p.getBirthday());

    return Person.savePerson(per);
  }
  // M #4
  @Override
  public Person createPerson(Person p){
    return Person.savePerson(p);
  }
  // M #5
  @Override
  public void deletePerson(Long id){
    Person.removePerson(id);
  }
  // M #6
  @Override
  public List<HealthMeasureHistory> readPersonHistory(Long id, String measureType){
    return HealthMeasureHistory.readPersonHistory(id, measureType);
  }
  // M #7
  @Override
  public List<MeasureDefinition> readMeasureTypes(){
    return MeasureDefinition.getAllMeasureDefinitions();
  }
  // M #8
  @Override
  public HealthMeasureHistory readPersonMeasure(Long id, String measureType, Long mid){
    return HealthMeasureHistory.getHealthMeasureHistoryByPidAndMid(id,measureType, mid);
  }
  // M #9
  @Override
  public HealthMeasureHistory savePersonMeasure(Long id, HealthMeasureHistory m){
    m.setMeasureDefinition(MeasureDefinition.getMeasureDefinitionByName(m.getMeasureDefinition().getMeasureName()));  
    return HealthMeasureHistory.savePersonMeasure(id, m);
  }
  // M #10
  @Override
  public HealthMeasureHistory updatePersonMeasure(Long id, HealthMeasureHistory m){
    return HealthMeasureHistory.updatePersonMeasure(id,m);
  }
}
