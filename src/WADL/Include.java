/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author l.IsSaM.l
 */
public class Include {
    
    private String href ;
    List<Doc> listOfDocs = new ArrayList<>();

    
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
    
}
