//
// Generated By:JAX-WS RI 2.2.10 (JAXB RI IBM IBM 2.2.10-06/29/2016 1:04:38 PMforeman-)
//


package db_emulator.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductResponse", namespace = "http://db_emulator/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductResponse", namespace = "http://db_emulator/")
public class GetProductResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
