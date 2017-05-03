package WSDL;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "soap:address")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapAddress implements Serializable{

    @XmlAttribute
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public SoapAddress() {

    }

    public SoapAddress(String location) {
        this.location = location;
    }
}