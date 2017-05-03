package WADL;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Ressources {

    protected List<Doc> doc;
    protected List<Ressource> resources;

    protected String base;

    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public Ressources() {
    }

    public Ressources(String base) {
        this.base = base;
    }

    public Ressources(List<Ressource> resources) {
        this.resources = resources;
    }

    public List<Doc> getDoc() {
        return doc;
    }

    public List<Ressource> getResources() {
        return resources;
    }

    public String getBase() {
        return base;
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

    public void setResources(List<Ressource> resources) {
        this.resources = resources;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }
}
