package WADL_;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Link
{
    protected List<Doc> doc;
    protected String resourceType;
    protected String rel;
    protected String rev;
    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public Link() {
    }

    public Link(String resourceType, String rel) {
        this.resourceType = resourceType;
        this.rel = rel;
    }


    public List<Doc> getDoc() {
        return doc;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getRel() {
        return rel;
    }

    public String getRev() {
        return rev;
    }

    public List<Object> getAny() {
        return any;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    @Override
    public String toString() {
        return "Link{" +
                "doc=" + doc +
                ", resourceType='" + resourceType + '\'' +
                ", rel='" + rel + '\'' +
                ", rev='" + rev + '\'' +
                ", any=" + any +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
