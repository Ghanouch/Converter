package WSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

@XmlRootElement(name = "wsdl:types")
@XmlAccessorType(XmlAccessType.FIELD)
public class Types implements Serializable{

    @XmlElement
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

    public void addSchema(Schema schema) {
        if(schemas == null) schemas = new ArrayList<Schema>();
        this.schemas.add(schema);
    }
}
