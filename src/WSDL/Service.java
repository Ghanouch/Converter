package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Service {
    private String name;
    private ArrayList<Port> ports;

    public void setName(String name) {
        this.name = name;
    }

    public void setPorts(ArrayList<Port> ports) {
        this.ports = ports;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Port> getPorts() {
        return ports;
    }

    public void addPort(Port port) {
        this.ports.add(port);
    }

    public Service() {
        ports = new ArrayList<Port>();
    }

    public Service(String name) {
        this.name = name;
        ports = new ArrayList<Port>();
    }

    public Service(String name, ArrayList<Port> ports) {
        this.name = name;
        this.ports = ports;
    }
}
