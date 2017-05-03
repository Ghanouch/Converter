package WADL;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public enum ParamStyle {

    PLAIN("plain"),
    QUERY("query"),
    MATRIX("matrix"),
    HEADER("header"),
    TEMPLATE("template");

    private final String value;

    ParamStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParamStyle fromValue(String v) {
        for (ParamStyle c: ParamStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
