/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL_;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author l.IsSaM.l
 */
public class Include {
    
    private String href ;
    List<Doc> listOfDocs = new ArrayList<>();
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();



    public Include(String href, List<Doc> listOfDocs) {
        this.href = href;
        this.listOfDocs = listOfDocs;
    }
    
    public Include(String href, Doc doc) {
        this.href = href;
        this.listOfDocs.add(doc);
    }
    
    public Include(String href) {
        this.href = href;
    }

    public Include() {
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    public String getHref() {
        return href;
    }

    public List<Doc> getListOfDocs() {
        return listOfDocs;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setListOfDocs(List<Doc> listOfDocs) {
        this.listOfDocs = listOfDocs;
    }
    
    public void addDoc(Doc doc){
        listOfDocs.add(doc);
    }


    @Override
    public String toString() {
        return "Include{" +
                "href='" + href + '\'' +
                ", listOfDocs=" + listOfDocs +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
