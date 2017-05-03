package WSDL;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:definitions")
@XmlAccessorType(XmlAccessType.FIELD)
public class Definition implements Serializable{

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "targetNameSpace")
    private String targetNameSpace;
    @XmlElement(name = "wsdl:import")
    private Import importDefinition;
    @XmlElement(name = "wsdl:types")
    private Types types;
    @XmlElement(name = "wsdl:message")
    private ArrayList<Message> messages;
    @XmlElement(name = "wsdl:service")
    private ArrayList<Service> services;
    @XmlElement(name = "wsdl:binding")
    private ArrayList<Binding> bindings;
    @XmlElement(name = "portType")
    private PortType portType;

    public void setName(String name) {
        this.name = name;
    }

    public void setTargetNameSpace(String targetNameSpace) {
        this.targetNameSpace = targetNameSpace;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public void setBindings(ArrayList<Binding> bindings) {
        this.bindings = bindings;
    }

    public void setPortType(PortType portType) {
        this.portType = portType;
    }

    public void setImportDefinition(Import importDefinition) {
        this.importDefinition = importDefinition;
    }

    public void setTypes(Types types) { this.types = types;}

    public String getName() {
        return name;
    }

    public String getTargetNameSpace() {
        return targetNameSpace;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public ArrayList<Binding> getBindings() {
        return bindings;
    }

    public PortType getPortType() {
        return portType;
    }

    public Import getImportDefinition() {
        return importDefinition;
    }

    public Types getTypes() { return types; }


    public Definition() {
        messages        = new ArrayList<Message>();
        services        = new ArrayList<Service>();
        bindings        = new ArrayList<Binding>();
        portType        = new PortType();
        importDefinition= new Import();
    }

    public Definition(String name, String targetNameSpace) {
        this.name = name;
        this.targetNameSpace = targetNameSpace;
        messages        = new ArrayList<Message>();
        services        = new ArrayList<Service>();
        bindings        = new ArrayList<Binding>();
        portType        = new PortType();
        importDefinition= new Import();
    }

    public Definition(String name, String targetNameSpace, ArrayList<Message> messages, ArrayList<Service> services, ArrayList<Binding> bindings, PortType portType, Import importDefinition, Types types) {
        this.name = name;
        this.targetNameSpace = targetNameSpace;
        this.messages = messages;
        this.services = services;
        this.bindings = bindings;
        this.portType = portType;
        this.importDefinition = importDefinition;
        this.types = types;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public void addBinding(Binding binding) {
        this.bindings.add(binding);
    }
}
