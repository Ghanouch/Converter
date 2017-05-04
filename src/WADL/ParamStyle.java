package WADL;//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.05.03 � 01:42:31 AM WEST 
//


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ParamStyle.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParamStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="matrix"/>
 *     &lt;enumeration value="header"/>
 *     &lt;enumeration value="template"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParamStyle")
@XmlEnum
public enum ParamStyle {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("matrix")
    MATRIX("matrix"),
    @XmlEnumValue("header")
    HEADER("header"),
    @XmlEnumValue("template")
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

    @Override
    public String toString() {
        return "ParamStyle{" +
                "value='" + value + '\'' +
                '}';
    }
}
