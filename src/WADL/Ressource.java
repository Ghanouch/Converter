package WADL;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Ressource {

    protected List<Doc> doc;
    protected List<Param> param;

    protected List<Ressource> resource;

    protected String id;
    protected List<String> type;
    protected String queryType;
    protected String path;


    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public Ressource() {
    }

    public Ressource(String path) {
        this.path = path;
    }

    public List<Doc> getDoc() {
        return doc;
    }

    public List<Param> getParam() {
        return param;
    }

    public List<Ressource> getResource() {
        return resource;
    }

    public String getId() {
        return id;
    }

    public List<String> getType() {
        return type;
    }

    public String getQueryType() {
        return queryType;
    }

    public String getPath() {
        return path;
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

    public void setParam(List<Param> param) {
        this.param = param;
    }

    public void setResource(List<Ressource> resource) {
        this.resource = resource;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    @Override
    public String toString() {
        return "Ressource{" +
                "doc=" + doc +
                ", param=" + param +
                ", resource=" + resource +
                ", id='" + id + '\'' +
                ", type=" + type +
                ", queryType='" + queryType + '\'' +
                ", path='" + path + '\'' +
                ", any=" + any +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
