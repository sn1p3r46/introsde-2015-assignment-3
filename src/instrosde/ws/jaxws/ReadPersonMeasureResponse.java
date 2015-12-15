
package introsde.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "readPersonMeasureResponse", namespace = "http://ws.introsde/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonMeasureResponse", namespace = "http://ws.introsde/")
public class ReadPersonMeasureResponse {

    @XmlElement(name = "return", namespace = "")
    private introsde.models.HealthMeasureHistory _return;

    /**
     * 
     * @return
     *     returns HealthMeasureHistory
     */
    public introsde.models.HealthMeasureHistory getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(introsde.models.HealthMeasureHistory _return) {
        this._return = _return;
    }

}
