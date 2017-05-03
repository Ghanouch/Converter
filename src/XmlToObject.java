import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class XmlToObject {



    public static void main(String[] str) {
        try
        {
            FileInputStream fip = new FileInputStream("src\\ressources\\WADL examples\\Myapplication.wadl");
        }
        catch (Exception e) {
            System.out.println(" Fichier introuvable" + e.getMessage());
        }
    }
}
