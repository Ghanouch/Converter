package WSDL;


import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "wsdl:output")
@XmlAccessorType(XmlAccessType.FIELD)
public class Output implements Serializable{

    @XmlAttribute
    private String message;
    @XmlElement
    private SoapBody soapBody;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSoapBody(SoapBody soapBody) {
        this.soapBody = soapBody;
    }

    public String getMessage() {
        return message;
    }

    public SoapBody getSoapBody() {
        return soapBody;
    }

    public Output() {
        this.soapBody = new SoapBody();
    }

    public Output(String message) {
        this.message = message;
        this.soapBody = new SoapBody();
    }

    public Output(String message, SoapBody soapBody) {
        this.message = message;
        this.soapBody = soapBody;
    }
}