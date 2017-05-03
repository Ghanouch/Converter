package WADL;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public enum HTTPMethods {

    GET,
    POST,
    PUT,
    HEAD,
    DELETE;

    public String value() {
        return name();
    }

    public static HTTPMethods fromValue(String v) {
        return valueOf(v);
    }

}
