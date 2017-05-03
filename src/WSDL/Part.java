package WSDL;


/**
 * Created by zGuindouOS on 02/05/2017.
 */


public class Part {

    private String name;
    private String type;
    private String element;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getElement() {
        return element;
    }

    public Part() {

    }

    public Part(String name, String type, String element) {
        this.name = name;
        this.type = type;
        this.element = element;
    }
}