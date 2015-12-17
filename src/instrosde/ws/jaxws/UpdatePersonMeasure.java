
package introsde.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updatePersonMeasure", namespace = "http://ws.introsde/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasure", namespace = "http://ws.introsde/", propOrder = {
    "arg0",
    "arg1"
})
public class UpdatePersonMeasure {

    @XmlElement(name = "arg0", namespace = "")
    private Long arg0;
    @XmlElement(name = "arg1", namespace = "")
    private introsde.models.Measure arg1;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Long arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns Measure
     */
    public introsde.models.Measure getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(introsde.models.Measure arg1) {
        this.arg1 = arg1;
    }

}
