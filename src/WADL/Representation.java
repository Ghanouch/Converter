/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author l.IsSaM.l
 */
public class Representation {

    protected List<Doc> doc;


    private MediaType mediaType;
    private String charset;
    private String element;
    private String profile;
    private String status;

    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();



    public Representation(MediaType mediaType, String charset, String element, String profile, String status) {
        this.mediaType = mediaType;
        this.charset = charset;
        this.element = element;
        this.profile = profile;
        this.status = status;
    }

    public Representation() {
    }

    public Representation(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    
    
    public MediaType getMediaType() {
        return mediaType;
    }

    public String getCharset() {
        return charset;
    }

    public String getElement() {
        return element;
    }

    public String getProfile() {
        return profile;
    }

    public String getStatus() {
        return status;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Doc> getDoc() {
        return doc;
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


    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    @Override
    public String toString() {
        return "Representation{" +
                "doc=" + doc +
                ", mediaType=" + mediaType +
                ", charset='" + charset + '\'' +
                ", element='" + element + '\'' +
                ", profile='" + profile + '\'' +
                ", status='" + status + '\'' +
                ", any=" + any +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
