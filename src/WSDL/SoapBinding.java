package WSDL;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
@XmlRootElement(name = "soap:binding")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBinding implements Serializable {

    @XmlAttribute
    private String style;
    @XmlAttribute
    private String transport;

    public void setStyle(String style) {
        this.style = style;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getStyle() {
        return style;
    }

    public String getTransport() {
        return transport;
    }

    public SoapBinding() {

    }

    public SoapBinding(String style, String transport) {
        this.style = style;
        this.transport = transport;
    }
}