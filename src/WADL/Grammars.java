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
public class Grammars {
    
    List<Include> listOfIncludes = new ArrayList<>();

    public Grammars(List<Include> listOfIncludes) {
        this.listOfIncludes = listOfIncludes;
    }

    public List<Include> getListOfIncludes() {
        return listOfIncludes;
    }

    public void setListOfIncludes(List<Include> listOfIncludes) {
        this.listOfIncludes = listOfIncludes;
    }
    
    public void addInclude(Include inc)
    {
        
    }
    
}