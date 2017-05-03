package WSDL;


/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class SoapOperation {

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