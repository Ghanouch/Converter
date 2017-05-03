/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADL;

/**
 *
 * @author l.IsSaM.l
 */
public enum MediaType {
    
    AppXML ("application/xml"),
    AppXMLandATOM ("application/atom+xml"),
    AppXMLandXHTML("application/xhtml+xml"),
    AppJSON ("application/json"),
    AppFORM("application/x-www-form-urlencoded"),
    AppSTREAM("application/octet-stream"),
    MultfORM("multipart/form-data"),
    TextPLAIN("text/plain"),
    TextXML("text/xml");
    
    
   private String name = "";
   
   //Constructeur
   MediaType(String name){
    this.name = name;
    }
   
   public String toString(){
    return name;
   }

    public String getName() {
        return name;
    }
   
    
}
