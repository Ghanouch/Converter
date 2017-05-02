import WSDL.WSDL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Converter {

    public static void main(String args[]) throws JAXBException {


        JAXBContext context = JAXBContext.newInstance(WSDL.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        WSDL wsdl = new WSDL(1, "/c/test.net", "/c/client.c", "10/11/1999");

        marshaller.marshal(wsdl, new File("mywsdltest.xml"));



    }

}
