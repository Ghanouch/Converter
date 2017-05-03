package WSDL;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:part")
@XmlAccessorType(XmlAccessType.FIELD)
public class Part implements Serializable{

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String element;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getElement() {
        return element;
    }

    public Part() {

    }

    public Part(String name, String type, String element) {
        this.name = name;
        this.type = type;
        this.element = element;
    }
}