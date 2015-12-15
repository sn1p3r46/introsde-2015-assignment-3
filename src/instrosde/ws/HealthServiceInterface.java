package introsde.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.util.List;

import introsde.models.Person;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface HealthServiceInterface{
    @WebMethod List<Person> readPersonList();
    @WebMethod Person readPerson(Long id);
}
