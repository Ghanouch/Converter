package WADL_;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Option {

    private String value;
    private Map<String, String> otherAttributes = new HashMap<String, String>();


    public Option(String value) {
        this.value = value;
    }

    public Option() {
    }

    public String getValue() {
        return value;
    }

    public Map<String, String> getOtherAttributes() {
        return otherAttributes;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setOtherAttributes(Map<String, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    public void addAttribute(String key , String val)
    {
        otherAttributes.put(key,val);
    }

    @Override
    public String toString() {
        return "Option{" +
                "value='" + value + '\'' +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
