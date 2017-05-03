package WSDL;


/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class SoapBody {

    private String encodingStyle;
    private String nameSpace;
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
