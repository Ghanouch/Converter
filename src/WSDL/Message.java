package WSDL;


import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class Message {

    private String name;
    private ArrayList<Part> parts;

    public void setName(String name) {
        this.name = name;
    }

    public void setPart(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Part> getPart() {
        return parts;
    }

    public Message() {
        this.parts = new ArrayList<Part>();
    }

    public Message(String name) {
        this.name = name;
        this.parts = new ArrayList<Part>();
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }
}
