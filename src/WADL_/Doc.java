/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL_;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author l.IsSaM.l
 */
public class Doc {
    
    private String lang ;
    private String title;
    private String content;

    protected List<Object> contents;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();



    public Doc(String lang, String title, String content) {
        this.lang = lang;
        this.title = title;
        this.content = content;
    }

    public Doc(String lang, String title) {
        this.lang = lang;
        this.title = title;
    }

    private Doc() {
        //no instance
    }
    
    public String getLang() {
        return lang;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContents(List<Object> contents) {
        this.contents = contents;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    public List<Object> getContents() {
        return contents;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "lang='" + lang + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", contents=" + contents +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
