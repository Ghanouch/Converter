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
public class Doc {
    
    private String lang ;
    private String title;
    private String content;

    public Doc(String lang, String title, String content) {
        this.lang = lang;
        this.title = title;
        this.content = content;
    }

    public Doc(String lang, String title) {
        this.lang = lang;
        this.title = title;
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
    
    
    
}
