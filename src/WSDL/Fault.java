package WSDL;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:fault")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fault implements Serializable{

    @XmlAttribute
    private String name;
    @XmlElement
    private String message;

    public Fault() {

    }

    public Fault(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}