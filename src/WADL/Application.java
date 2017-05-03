package WADL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Application {

    protected List<Doc> doc;
    protected List<Ressources> resources;

    protected Grammars grammars;

    protected List<Object> any;

    Map<String, String> listOfNamesSpaces = new HashMap<>();
    public Application() {
    }



    public List<Doc> getDoc() {
        return doc;
    }

    public List<Ressources> getResources() {
        return resources;
    }

    public Grammars getGrammars() {
        return grammars;
    }

    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }

    public void setResources(List<Ressources> resources) {
        this.resources = resources;
    }

    public void setGrammars(Grammars grammars) {
        this.grammars = grammars;
    }

    public List<Object> getAny() {
        return any;
    }

    public Map<String, String> getListOfNamesSpaces() {
        return listOfNamesSpaces;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setListOfNamesSpaces(Map<String, String> listOfNamesSpaces) {
        this.listOfNamesSpaces = listOfNamesSpaces;
    }
}
