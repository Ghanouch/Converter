package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Binding {

    public static class SoapBinding {

        private String style;
        private String transport;

        public void setStyle(String style) {
            this.style = style;
        }

        public void setTransport(String transport) {
            this.transport = transport;
        }

        public String getStyle() {
            return style;
        }

        public String getTransport() {
            return transport;
        }

        public SoapBinding() {

        }

        public SoapBinding(String style, String transport) {
            this.style = style;
            this.transport = transport;
        }
    }

    private String name;
    private String type;
    private SoapBinding soapBinding;
    private ArrayList<Operation> operations;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSoapBinding(Binding.SoapBinding soapBinding) {
        this.soapBinding = soapBinding;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Binding.SoapBinding getSoapBinding() {
        return soapBinding;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public Binding() {
        soapBinding = new SoapBinding();
        operations  = new ArrayList<Operation>();
    }

    public Binding(String name, String type) {
        this.name = name;
        this.type = type;
        soapBinding = new SoapBinding();
        operations  = new ArrayList<Operation>();
    }

    public Binding(String name, String type, Binding.SoapBinding soapBinding, ArrayList<Operation> operations) {
        this.name = name;
        this.type = type;
        this.soapBinding = soapBinding;
        this.operations = operations;
    }
}
