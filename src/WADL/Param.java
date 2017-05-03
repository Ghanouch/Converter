package WADL;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Param {

    protected List<Doc> doc;
    protected List<Option> option;
    protected Link link;

    protected ParamStyle style;

    protected String href;
    protected String name;
    protected String id;
    protected QName type;
    protected String _default;
    protected Boolean required;
    protected Boolean repeating;
    protected String fixed;
    protected String path;

    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    protected List<Object> any;




    public List<Doc> getDoc() {
        return doc;
    }

    public List<Option> getOption() {
        return option;
    }

    public Link getLink() {
        return link;
    }

    public ParamStyle getStyle() {
        return style;
    }

    public String getHref() {
        return href;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public QName getType() {
        return type;
    }

    public String get_default() {
        return _default;
    }

    public Boolean getRequired() {
        return required;
    }

    public Boolean getRepeating() {
        return repeating;
    }

    public String getFixed() {
        return fixed;
    }

    public String getPath() {
        return path;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public List<Object> getAny() {
        return any;
    }

    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }

    public void setOption(List<Option> option) {
        this.option = option;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public void setStyle(ParamStyle style) {
        this.style = style;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(QName type) {
        this.type = type;
    }

    public void set_default(String _default) {
        this._default = _default;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public void setRepeating(Boolean repeating) {
        this.repeating = repeating;
    }

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }
}
