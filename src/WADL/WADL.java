package WADL;

import WSDL.Definition;

import java.util.Date;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class WADL {

    private int id;
    private String providerURL;
    private String clientURL;
    private Date date;
    private Definition definition;


    public WADL() {
    }

    public WADL(int id, String providerURL, String clientURL, Date date, Definition definition) {
        this.id = id;
        this.providerURL = providerURL;
        this.clientURL = clientURL;
        this.date = date;
        this.definition = definition;
    }

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

    @Override
    public String toString() {
        return "WADL{" +
                "id=" + id +
                ", providerURL='" + providerURL + '\'' +
                ", clientURL='" + clientURL + '\'' +
                ", date=" + date +
                ", definition=" + definition +
                '}';
    }
}
