
package introsde.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createPerson", namespace = "http://ws.introsde/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPerson", namespace = "http://ws.introsde/")
public class CreatePerson {

    @XmlElement(name = "arg0", namespace = "")
    private introsde.models.Person arg0;

    /**
     * 
     * @return
     *     returns Person
     */
    public introsde.models.Person getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(introsde.models.Person arg0) {
        this.arg0 = arg0;
    }

}
