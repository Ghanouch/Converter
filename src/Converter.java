import WADL.WADL;
import WSDL.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Converter {

    public static void main(String args[]) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(WSDL.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);



        Input input = new Input("Hello",  new SoapBody("UTF", "http://www.w3.org/1999/XSL/Transform", "Attrebute"));
        Output output = new Output("Hi",  new SoapBody("UTF", "http://www.w3.org/1999/XSL/Transform", "Attrebute"));
        Operation operation = new Operation("Say hello", input, output, new Fault("zGuind", "I am here"), new SoapOperation("ENSIAS"));
        Definition definition = new Definition("Hello_Def", "http/hello/defi");
        Message msg = new Message("je suis zguindou");
        msg.addPart(new Part("a", "a", "a"));
        msg.addPart(new Part("b", "b", "b"));
        msg.addPart(new Part("c", "c", "c"));
        msg.addPart(new Part("d", "d", "d"));
        definition.addMessage(msg);
        Binding binding = new Binding("zg_bind", "prog");
        binding.addOperation(operation);
        binding.setSoapBinding(new SoapBinding("test1", "test1"));
        definition.addBinding(binding);
        Service ser = new Service("rir");
        ser.addPort(new Port("b", "b", new SoapAddress("Rabat")));
        definition.addService(ser);
        PortType portType = new PortType("HTTP");
        portType.addOperation(operation);
        definition.setPortType(portType);
        definition.setImportDefinition(new Import("ggg/jjjj/ssd.com", "Rabat"));
        Types type = new Types();
        type.addSchema(new Schema("Hello wolrd schema"));
        definition.setTypes(type);


        WSDL wsdl = new WSDL(2, "p1", "p2", "p3");
        wsdl.setDefinition(definition);



        marshaller.marshal(wsdl, new File("wsdlResult.xml"));
    }
}
