package WSDL;


import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:FromWADL")
@XmlAccessorType(XmlAccessType.FIELD)
public class WSDL implements Serializable {

    @javax.xml.bind.annotation.XmlAttribute
    private int id;
    @javax.xml.bind.annotation.XmlAttribute
    private String providerURL;
    @javax.xml.bind.annotation.XmlAttribute
    private String clientURL;
    @javax.xml.bind.annotation.XmlAttribute
    private String date;
    @javax.xml.bind.annotation.XmlElement(name = "wsdl:definitions")
    private Definition definition;

    public void setId(int id) {
        this.id = id;
    }

    public void setProviderURL(String providerURL) {
        this.providerURL = providerURL;
    }

    public void setClientURL(String clientURL) {
        this.clientURL = clientURL;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public String getProviderURL() {
        return providerURL;
    }

    public String getClientURL() {
        return clientURL;
    }

    public String getDate() {
        return date;
    }

    public Definition getDefinition() {
        return definition;
    }

    public WSDL() {

    }

    public WSDL(int id, String providerURL, String clientURL, String date) {
        this.id = id;
        this.providerURL = providerURL;
        this.clientURL = clientURL;
        this.date = date;
        this.definition = new Definition();
    }

    public WSDL(int id, String providerURL, String clientURL, String date, Definition definition) {
        this.id = id;
        this.providerURL = providerURL;
        this.clientURL = clientURL;
        this.date = date;
        this.definition = definition;
    }
}
