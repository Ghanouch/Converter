package Mapping;

import WADL.Application;
import WSDL.TDefinitions;
import WSDL.TMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by zGuindouOS on 05/05/2017.
 */
public class WSDLMapping {

    public static final String nameFile = "GoogleSearch";

    public static String getPathGenerate(String nameFile) { return "src\\Ressources\\WSDL\\WSDL generate\\" + nameFile; }
    public static String getPathFrom(String nameFile)
    {
        return "src\\Ressources\\WSDL\\WSDL examples\\" + nameFile;
    }

    public static TDefinitions getObjectFromWSDL(String nameFile)
    {
        try
        {
            // Pour igoner la  balise de name space xmlns
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(getPathFrom(nameFile+".wsdl")));
            xsr = new XMLMapping.XsiTypeReader(xsr);

            // Unmarshall Xml --> Object
            JAXBContext jc = JAXBContext.newInstance(TDefinitions.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            TDefinitions def = (TDefinitions) unmarshaller.unmarshal(xsr);

            return def;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }

    public static void ConvertWSDLObjectToXML(TDefinitions definition , String nameFile)
    {
        try
        {
            // Convert from Object WSDL to Xml WSDL to be sur
            JAXBContext jc = JAXBContext.newInstance(TDefinitions.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(definition, new File(getPathGenerate(nameFile+".wsdl")));
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        TDefinitions definitions = null;

        //-------------------------------------- Convert From File WSDL to Object --------------------------------------//
        try {
            System.out.println("Convert from File To Object ...");
            definitions = getObjectFromWSDL(nameFile);
        } catch(Exception e)  {
            System.out.println("Error ETAPE 1 : " +e.getMessage());
        }

        //-------------------------------------- Convert from Object WSDL to File.wsdl -------------------------------//
        try {
            System.out.println("Convert From Object To File");
            ConvertWSDLObjectToXML(definitions, nameFile);
            System.out.println(" - -  Succes Mission !! - - ");
        } catch(Exception e) {
            System.out.println("Error ETAPE 3 : " +e.getMessage());
        }
    }


}
