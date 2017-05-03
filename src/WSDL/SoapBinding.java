package WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class SoapBinding {

    private String style;
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