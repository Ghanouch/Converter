import WADL.Application;
import WADL.Doc;
import WADL.Param;
import WADL.Resource;

import java.util.List;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class __Mapping_Xml_Object {




    public static void main(String[] str) throws Exception {
        try {

            //readFile("Myapplication.wadl");

            //-------------------------------------- Convert From File WADL to Object --------------------------------------//

            Application application = Mapping_WSDL.getObjectFromWADL("Myapplication.wadl");


            //System.out.println(application);


            System.out.println("-------------- DOCUMENTATION Application--------------");
            Doc doc = application.getDoc().get(0);
            System.out.println(doc);


            System.out.println("-------------- DOCUMENTATION Include--------------");
            doc = application.getGrammars().getInclude().get(0).getDoc().get(0);
            System.out.println(doc);


            System.out.println("-------------- 1ere ressource --------------");
            Resource res = (Resource) application.getResources().get(0).getResource().get(0).getMethodOrResource().get(0);


            System.out.println("-------------- PATH de 1ére ressource --------------");
            System.out.println(res.getPath());

            System.out.println("-------------- 1ere PARAM de 1ére ressource --------------");
            List<Param> param = res.getParam();
            if (param.size() == 0)
                System.out.println("Pas de Parametre dans cette balise");
            else
                System.out.println(param);


            System.out.println(" - -  Succes Mission !! - - ");

        } catch (Exception e) {
            System.out.println("Eroor");
            System.out.println("+++++++++++++" + e.getMessage());
        }


    }


}
