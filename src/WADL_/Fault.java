/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL_;

/**
 *
 * @author l.IsSaM.l
 */
public class Fault {
    
    private String status;
    private MediaType mediaType;
    private String element;
    private int id;
    private String name;
    private String style;
    private String type;
    private String path;
    private boolean required;
    private boolean repeating;
    private String fixed;

    public Fault() {
    }

    public Fault(String status, MediaType mediaType, String element, int id, String name, String style, String type, String path, boolean required, boolean repeating, String fixed) {
        this.status = status;
        this.mediaType = mediaType;
        this.element = element;
        this.id = id;
        this.name = name;
        this.style = style;
        this.type = type;
        this.path = path;
        this.required = required;
        this.repeating = repeating;
        this.fixed = fixed;
    }

   
    
    

    public String getStatus() {
        return status;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public String getElement() {
        return element;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isRepeating() {
        return repeating;
    }

    public String getFixed() {
        return fixed;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setRepeating(boolean repeating) {
        this.repeating = repeating;
    }

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }
    

    
     @Override
    public String toString() {
        return "Fault{" + "status=" + status + ", mediaType=" + mediaType + ", element=" + element + ", id=" + id + ", name=" + name + ", style=" + style + ", type=" + type + ", path=" + path + ", required=" + required + ", repeating=" + repeating + ", fixed=" + fixed + '}';
    }
    
    
    
    
}
