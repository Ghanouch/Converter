package Mapping;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by zGuindouOS on 05/05/2017.
 */
public class XMLMapping {

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

    public static void readFile(String nameFile)
    {
        FileInputStream fip;
        int i;
        try
        {
            fip = new FileInputStream("src\\ressources\\WADL\\WADL examples\\" + nameFile);
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

}
