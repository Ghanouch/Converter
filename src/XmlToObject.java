
import WADL.Application;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class XmlToObject {

    public static String getPath(String nameFile)
    {
        return "src\\ressources\\WADL examples\\" + nameFile;
    }

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


    public static void main(String[] str)
    {

        //readFile("Myapplication.wadl");

        try {
            JAXBContext jc = JAXBContext.newInstance(Application.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Application app = (Application) unmarshaller.unmarshal(new File(getPath("Myapplication.wadl")));
            System.out.println(app);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }


}
