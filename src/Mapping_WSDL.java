

import WADL.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Mapping_WSDL {

    private static final String nameFile = "wadl4";

    protected static class XsiTypeReader extends StreamReaderDelegate
    {
        public XsiTypeReader(XMLStreamReader reader) {
            super(reader);
        }
        @Override
        public String getNamespaceURI() {
            return "";
        }


    }


    public static String getPathFrom(String nameFile)
    {
        return "src\\ressources\\WADL examples\\" + nameFile;
    }

    public static String getPathGenerate(String nameFile) { return "src\\ressources\\WADL generate\\" + nameFile; }


    public static void readFile(String nameFile)
    {
        FileInputStream fip;
        int i;
        try
        {
            fip = new FileInputStream("src\\ressources\\WADL examples\\"+nameFile);
            InputStreamReader sc = new InputStreamReader(fip);
            while((i = sc.read())!=-1) {
                System.out.print((char)i);
            }
        }
        catch (Exception e)
        {
            System.out.println(" Fichier introuvable" + e.getMessage());
        }
    }

    public static Application getObjectFromWADL(String nameFile)
    {
        try
        {
            // Pour igoner la  balise de name space xmlns
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(getPathFrom(nameFile+".wadl")));
            xsr = new XsiTypeReader(xsr);

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

    public static void ConvertWADLObjectToXML(Application application , String nameFile)
    {
        try
        {
            // Convert from Object WADL to Xml WADL to be sur
            JAXBContext jc = JAXBContext.newInstance(Application.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(application, new File( getPathGenerate(nameFile+".wadl")));
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] str)
    {

        //readFile("Myapplication.wadl");
        Application application = null;

        //-------------------------------------- Convert From File WADL to Object --------------------------------------//
        try
        {
            System.out.println("Convert from File To Object ...");
            application = getObjectFromWADL(nameFile);
        }catch(Exception e)
        {
            System.out.println("Error ETAPE 1 : " +e.getMessage());
        }

        //System.out.println(application);


        // --------------------------------------      Modify Wadl Object       --------------------------------------//


        try
        {
            System.out.println("Modification ...");

            application.getGrammars().getInclude().get(0).getDoc().get(0).setLang("fr");
            application.getGrammars().getInclude().get(0).getDoc().get(0).setTitle("Issam");
            Resource res = (Resource) application.getResources().get(0).getResource().get(0).getMethodOrResource().get(0);
            res.setPath("Issam  peut faire ce que je veux");
        }catch(Exception e)
        {
            System.out.println("Error ETAPE 2 : " +e.getCause());
        }



        //-------------------------------------- Convert from Object WADL to File.wadl -------------------------------//
        try
        {
            System.out.println("Convert From Object To File");
            ConvertWADLObjectToXML(application, nameFile);



            System.out.println(" - -  Succes Mission !! - - ");
        }catch(Exception e)
        {
            System.out.println("Error ETAPE 3 : " +e.getMessage());
        }






    }




}
