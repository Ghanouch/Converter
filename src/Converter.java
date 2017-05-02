import WSDL.WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Converter {

    public static void main(String args[]) {

        WSDL wsdl = new WSDL();
        wsdl.setClientURL("hhhhhh");

        System.out.print(wsdl.getClientURL());

    }

}
