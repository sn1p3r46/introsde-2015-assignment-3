package introsde.ws;


import javax.jws.WebService;
import java.util.List;

import introsde.models.Person;
import introsde.models.Measure;
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
    return Person.getPersonById((int) (long)(id));
  }
  // M #3
  @Override
  public Person updatePerson(Person p){
    //p.setMeasure(null);
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
  public List<Measure> readPersonHistory(Long id, String measureType){
    return Measure.readPersonHistory(id, measureType);
  }
  // M #7
  @Override
  public List<MeasureDefinition> readMeasureTypes(){
    return MeasureDefinition.getAllMeasureDefinitions();
  }
  // M #8
  @Override
  public Measure readPersonMeasure(Long id, String measureType, Long mid){
    return Measure.getMeasureByPidAndMid(id,measureType, mid);
  }
  // M #9
  @Override
  public Measure savePersonMeasure(Long id, Measure m){
    m.setMeasureDefinition(MeasureDefinition.getMeasureDefinitionByName(m.getMeasureDefinition().getMeasureType()));
    return Measure.savePersonMeasure(id, m);
  }
  // M #10
  @Override
  public Measure updatePersonMeasure(Long id, Measure m){
    return Measure.updatePersonMeasure(id,m);
  }
}
