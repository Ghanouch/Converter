

import WADL.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class XmlToObject {

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

            // Convert From WADL To Object
            JAXBContext jc = JAXBContext.newInstance(Application.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Application app = (Application) unmarshaller.unmarshal(new File(getPathFrom(nameFile)));
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
            application = getObjectFromWADL("Myapplication.wadl");
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
            res.setPath("Je peux faire ce que je veux");
        }catch(Exception e)
        {
            System.out.println("Error ETAPE 2 : " +e.getCause());
        }



        //-------------------------------------- Convert from Object WADL to File.wadl -------------------------------//
        try
        {
            System.out.println("Convert From Object To File");
            ConvertWADLObjectToXML(application, "newFile");


            System.out.println(" - -  Succes Mission !! - - ");
        }catch(Exception e)
        {
            System.out.println("Error ETAPE 3 : " +e.getMessage());
        }






    }


}
