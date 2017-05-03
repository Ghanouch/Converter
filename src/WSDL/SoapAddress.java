package WSDL;


/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class SoapAddress {

    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public SoapAddress() {

    }

    public SoapAddress(String location) {
        this.location = location;
    }
}