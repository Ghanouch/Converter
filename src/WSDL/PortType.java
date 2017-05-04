package WSDL;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 03/05/2017.
 */

@XmlRootElement(name = "wsdl:portType")
@XmlAccessorType(XmlAccessType.FIELD)
public class PortType implements Serializable{

    @XmlAttribute
    private String name;
    @XmlElement
    private ArrayList<Operation> operations;

    public void setName(String name) {
        this.name = name;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public PortType() {
        operations = new ArrayList<Operation>();
    }

    public PortType(String name) {
        this.name = name;
        operations = new ArrayList<Operation>();
    }
}