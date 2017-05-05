//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.05.03 à 01:46:17 AM WEST 
//


package org.xmlsoap.schemas.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour tOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}request-response-or-one-way-operation"/>
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}solicit-response-or-notification-operation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="parameterOrder" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperation", propOrder = {
    "rest"
})
public class TOperation
    extends TExtensibleDocumented
{

    @XmlElementRefs({
        @XmlElementRef(name = "fault", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "input", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "output", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends TExtensibleAttributesDocumented>> rest;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "parameterOrder")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> parameterOrder;

    /**
     * Obtient le reste du modèle de contenu. 
     * 
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante : 
     * Le nom de champ "Output" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
     * ligne 217 sur file:/C:/Users/l.IsSaM.l/Documents/GitHub/PFA%20convertor/GENERATION%20Avec%20JAXB/WSDL/WSDL.xsd
     * ligne 209 sur file:/C:/Users/l.IsSaM.l/Documents/GitHub/PFA%20convertor/GENERATION%20Avec%20JAXB/WSDL/WSDL.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
     * des deux déclarations suivantes afin de modifier leurs noms : 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TFault }{@code >}
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TExtensibleAttributesDocumented>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends TExtensibleAttributesDocumented>>();
        }
        return this.rest;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parameterOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParameterOrder() {
        if (parameterOrder == null) {
            parameterOrder = new ArrayList<String>();
        }
        return this.parameterOrder;
    }

}
