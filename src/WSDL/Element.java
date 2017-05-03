package WSDL;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zGuindouOS on 02/05/2017.
 */

public class Element {

    private String name;
    private String baseType;
    private String minOccur;
    private String maxOccur;

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public void setMinOccur(String minOccur) {
        this.minOccur = minOccur;
    }

    public void setMaxOccur(String maxOccur) {
        this.maxOccur = maxOccur;
    }

    public String getName() {
        return name;
    }

    public String getBaseType() {
        return baseType;
    }

    public String getMinOccur() {
        return minOccur;
    }

    public String getMaxOccur() {
        return maxOccur;
    }

    public Element() {

    }

    public Element(String name, String baseType, String minOccur, String maxOccur) {
        this.name     = name;
        this.baseType = baseType;
        this.minOccur = minOccur;
        this.maxOccur = maxOccur;
    }
}
