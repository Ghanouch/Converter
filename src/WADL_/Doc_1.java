package WADL_;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Doc_1 {

    private String lang ;
    private String title;

    public String getLang() {
        return lang;
    }

    public String getTitle() {
        return title;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Doc_1(String lang, String title) {
        this.lang = lang;
        this.title = title;
    }

    private Doc_1() {
        //no instance
    }
}
