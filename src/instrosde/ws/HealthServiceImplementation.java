package introsde.ws;

import static java.lang.Math.toIntExact;

import javax.jws.WebService;
import java.util.List;

import introsde.models.Person;


@WebService(endpointInterface = "introsde.ws.HealthServiceInterface")
public class HealthServiceImplementation implements HealthServiceInterface{
  @Override
  public List<Person> readPersonList(){
    return Person.getAllPeople();
  }

  @Override
  public Person readPerson(Long id){
    return Person.getPersonById(toIntExact(id));
  }
}
