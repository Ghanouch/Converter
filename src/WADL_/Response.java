package WADL_;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Response {

    protected List<Doc> doc;
    protected List<Param> param;
    protected List<Representation> representation;
    protected List<Fault> faut;
    protected Long status;

    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public List<Doc> getDoc() {
        return doc;
    }

    public List<Param> getParam() {
        return param;
    }

    public List<Representation> getRepresentation() {
        return representation;
    }

    public List<Fault> getFaut() {
        return faut;
    }

    public Long getStatus() {
        return status;
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

    public void setRepresentation(List<Representation> representation) {
        this.representation = representation;
    }

    public void setFaut(List<Fault> faut) {
        this.faut = faut;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    @Override
    public String toString() {
        return "Response{" +
                "doc=" + doc +
                ", param=" + param +
                ", representation=" + representation +
                ", faut=" + faut +
                ", status=" + status +
                ", any=" + any +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
