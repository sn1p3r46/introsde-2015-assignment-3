package introsde.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.util.List;

import introsde.models.Person;
import introsde.models.HealthMeasureHistory;
import introsde.models.MeasureDefinition;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface HealthServiceInterface{
    // M #1
    @WebMethod List<Person> readPersonList();
    // M #2
    @WebMethod Person readPerson(Long id);
    // M #3
    @WebMethod Person updatePerson(Person p);
    // M #4
    @WebMethod Person createPerson(Person p);
    // M #5
    @WebMethod void deletePerson(Long id);
    // M #6
    @WebMethod List<HealthMeasureHistory> readPersonHistory(Long id, String measureType);
    // M #7
    @WebMethod List<MeasureDefinition> readMeasureTypes();
    // M #8
    @WebMethod HealthMeasureHistory readPersonMeasure(Long id, String measureType, Long mid);
    // M #9
    @WebMethod HealthMeasureHistory savePersonMeasure(Long id, HealthMeasureHistory m);
    // M #10
    @WebMethod HealthMeasureHistory updatePersonMeasure(Long id, HealthMeasureHistory m);
}
