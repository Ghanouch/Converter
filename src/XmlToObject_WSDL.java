import WADL.Application;
import WSDL.TDefinitions;
import WSDL.TMessage;
import WSDL.TTypes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by l.IsSaM.l on 04/05/2017.
 */
public class XmlToObject_WSDL {

    public static final String nameFile = "GoogleSearch";

    public static String getPathGenerate(String nameFile) { return "src\\ressources\\WSDL generate\\" + nameFile; }


    public static String getPathFrom(String nameFile)
    {
        return "src\\ressources\\WSDL examples\\" + nameFile;
    }

    //public static TDefinitions getObjectFromWSDL(String nameFile)



    public static void main(String[] args)
    {
        try
        {
            // Pour igoner la  balise de name space xmlns
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(getPathFrom(nameFile+".wsdl")));
            xsr = new Mapping_WSDL.XsiTypeReader(xsr);

            // Unmarshall Xml --> Object
            JAXBContext jc = JAXBContext.newInstance(TDefinitions.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            TDefinitions def = (TDefinitions) unmarshaller.unmarshal(xsr);
                // Convert from Object WADL to Xml WADL to be sur

            TMessage tMessage = (TMessage) def.getAnyTopLevelOptionalElement().get(1);
            tMessage.setName("Sir Takhra");
            System.out.println(tMessage.getName());
           // System.out.println(tTypes.getName());

                Marshaller marshaller = jc.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(def, new File( getPathGenerate(nameFile+".wsdl")));


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
