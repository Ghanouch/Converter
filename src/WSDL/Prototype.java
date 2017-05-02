package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Prototype {

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

    public Prototype() {
        operations = new ArrayList<Operation>();
    }

    public Prototype(String name) {
        this.name = name;
        operations = new ArrayList<Operation>();
    }
}
