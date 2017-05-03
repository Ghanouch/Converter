package WSDL;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement
public class WSDL {

    private int id;
    private String providerURL;
    private String clientURL;
    private Date date;
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

    public void setDate(Date date) {
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

    public Date getDate() {
        return date;
    }

    public Definition getDefinition() {
        return definition;
    }

    public WSDL() {

    }

    public WSDL(int id, String providerURL, String clientURL, Date date) {
        this.id = id;
        this.providerURL = providerURL;
        this.clientURL = clientURL;
        this.date = date;
        //this.definition = new Definition();
    }

    public WSDL(int id, String providerURL, String clientURL, Date date, Definition definition) {
        this.id = id;
        this.providerURL = providerURL;
        this.clientURL = clientURL;
        this.date = date;
        this.definition = definition;
    }
}
