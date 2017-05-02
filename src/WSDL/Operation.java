package WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Operation {

    private String name;
    private Input input;
    private Output output;
    private Fault fault;
    private SoapOperation soapOperation;

    public void setName(String name) {
        this.name = name;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void setFault(Fault fault) {
        this.fault = fault;
    }

    public void setSoapOperation(SoapOperation soapOperation) {
        this.soapOperation = soapOperation;
    }

    public String getName() {
        return name;
    }

    public Input getInput() {
        return input;
    }

    public Output getOutput() {
        return output;
    }

    public Fault getFault() {
        return fault;
    }

    public SoapOperation getSoapOperation() {
        return soapOperation;
    }

    public Operation() {


    }

    public Operation(String name, Input input, Output output, Fault fault, SoapOperation soapOperation) {
        this.name = name;
        this.input = input;
        this.output = output;
        this.fault = fault;
        this.soapOperation = soapOperation;
    }
}
