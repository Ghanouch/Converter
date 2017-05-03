package WSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "wsdl:import")
@XmlAccessorType(XmlAccessType.FIELD)
public class Import implements Serializable{

    @XmlAttribute
    private String nameSpace;
    @XmlAttribute
    private String location;

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public String getLocation() {
        return location;
    }

    public Import() {

    }

    public Import(String nameSpace, String location) {
        this.nameSpace = nameSpace;
        this.location = location;
    }
}
