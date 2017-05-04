import WADL.Application;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

/**
 * Created by l.IsSaM.l on 04/05/2017.
 */
public class XmlToObject_WSDL {

    public static String getPathFrom(String nameFile)
    {
        return "src\\ressources\\WSDL examples\\" + nameFile;
    }

    public static Application getObjectFromWADL(String nameFile)
    {
        try
        {
            // Pour igoner la  balise de name space xmlns
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(getPathFrom(nameFile+".wadl")));
            xsr = new Mapping_WSDL.XsiTypeReader(xsr);

            // Unmarshall Xml --> Object
            JAXBContext jc = JAXBContext.newInstance(Application.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Application app = (Application) unmarshaller.unmarshal(xsr);

            return app;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }


}
