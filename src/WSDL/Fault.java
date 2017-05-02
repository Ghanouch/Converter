package WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Fault {
    private String message;

    public Fault(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}