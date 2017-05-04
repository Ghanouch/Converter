package WSDL;


import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:operation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation implements Serializable{

    @XmlAttribute
    private String name;
    @XmlElement
    private Input input;
    @XmlElement
    private Output output;
    @XmlElement
    private Fault fault;
    @XmlElement
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
        return this.soapOperation;
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
