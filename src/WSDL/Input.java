package WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Input {

    private String message;
    private SoapBody soapBody;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSoapBody(SoapBody soapBody) {
        this.soapBody = soapBody;
    }

    public String getMessage() {
        return message;
    }

    public SoapBody getSoapBody() {
        return soapBody;
    }

    public Input() {
        this.soapBody = new SoapBody();
    }

    public Input(String message) {
        this.message = message;
        this.soapBody = new SoapBody();
    }
}