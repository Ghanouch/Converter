//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.05.03 � 01:46:17 AM WEST 
//


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       This type is extended by  component types to allow them to be documented
 *       
 * 
 * <p>Classe Java pour tDocumented complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tDocumented">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://schemas.xmlsoap.org/wsdl/}tDocumentation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDocumented", propOrder = {
    "documentation"
})
@XmlSeeAlso({
    TExtensibleAttributesDocumented.class,
    TExtensibleDocumented.class
})
public class TDocumented {

    protected TDocumentation documentation;

    /**
     * Obtient la valeur de la propri�t� documentation.
     * 
     * @return
     *     possible object is
     *     {@link TDocumentation }
     *     
     */
    public TDocumentation getDocumentation() {
        return documentation;
    }

    /**
     * D�finit la valeur de la propri�t� documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link TDocumentation }
     *     
     */
    public void setDocumentation(TDocumentation value) {
        this.documentation = value;
    }

}
