package WSDL;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "soap:body")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBody implements Serializable{

    @XmlAttribute
    private String encodingStyle;
    @XmlAttribute
    private String nameSpace;
    @XmlAttribute
    private String use;

    public SoapBody() {

    }

    public SoapBody(String encodingStyle, String nameSpace, String use) {
        this.encodingStyle = encodingStyle;
        this.nameSpace = nameSpace;
        this.use = use;
    }

    public void setEncodingStyle(String encodingStyle) {
        this.encodingStyle = encodingStyle;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getEncodingStyle() {
        return encodingStyle;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public String getUse() {
        return use;
    }
}
