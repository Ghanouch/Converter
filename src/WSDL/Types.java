package WSDL;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Types {

    ArrayList<Schema> schemas;

    public void setSchemas(ArrayList<Schema> schemas) {
        this.schemas = schemas;
    }

    public ArrayList<Schema> getSchemas() {
        return schemas;
    }

    public Types() {

    }

    public Types(ArrayList<Schema> schemas) {
        this.schemas = schemas;
    }
}
