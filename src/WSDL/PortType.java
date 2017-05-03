package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 03/05/2017.
 */
public class PortType {

    private String name;
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