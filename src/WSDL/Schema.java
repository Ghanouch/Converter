package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class Schema {

    private String targetNameSpace;
    private ArrayList<Element> elements;

    public void setTargetNameSpace(String targetNameSpace) {
        this.targetNameSpace = targetNameSpace;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public String getTargetNameSpace() {
        return targetNameSpace;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public Schema() {
        elements = new ArrayList<Element>();
    }

    public Schema(String targetNameSpace) {
        this.targetNameSpace = targetNameSpace;
        elements = new ArrayList<Element>();
    }

    public Schema(String targetNameSpace, ArrayList<Element> elements) {
        this.targetNameSpace = targetNameSpace;
        this.elements = elements;
    }
}
