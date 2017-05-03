package WSDL;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "soap:operation")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapOperation implements Serializable{

    @XmlAttribute
    private String soapAction;

    public SoapOperation(String soapAction) {
        this.soapAction = soapAction;
    }

    public String getSoapAction() {
        return soapAction;
    }

    public SoapOperation() {

    }

    public void setSoapAction(String soapAction) {
        this.soapAction = soapAction;
    }
}