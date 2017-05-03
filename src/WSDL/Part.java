package WSDL;


/**
 * Created by zGuindouOS on 02/05/2017.
 */


public class Part {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Part(String name, String type) {
        this.name = name;
        this.type = type;
    }
}