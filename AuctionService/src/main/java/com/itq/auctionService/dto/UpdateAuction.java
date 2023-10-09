//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.09 a las 01:24:24 PM CST 
//


package com.itq.auctionService.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auctionID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="newAuctionDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{2}-[0-9]{2}-[0-9]{4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newInitialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="newFinalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="newStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Activa"/&gt;
 *               &lt;enumeration value="Inactiva"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auctionID",
    "newAuctionDate",
    "newInitialPrice",
    "newFinalPrice",
    "newStatus"
})
@XmlRootElement(name = "updateAuction")
public class UpdateAuction {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String auctionID;
    @XmlElement(required = true)
    protected String newAuctionDate;
    @XmlElement(required = true)
    protected BigDecimal newInitialPrice;
    @XmlElement(required = true)
    protected BigDecimal newFinalPrice;
    @XmlElement(required = true)
    protected String newStatus;

    /**
     * Obtiene el valor de la propiedad auctionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionID() {
        return auctionID;
    }

    /**
     * Define el valor de la propiedad auctionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionID(String value) {
        this.auctionID = value;
    }

    /**
     * Obtiene el valor de la propiedad newAuctionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAuctionDate() {
        return newAuctionDate;
    }

    /**
     * Define el valor de la propiedad newAuctionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAuctionDate(String value) {
        this.newAuctionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad newInitialPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewInitialPrice() {
        return newInitialPrice;
    }

    /**
     * Define el valor de la propiedad newInitialPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewInitialPrice(BigDecimal value) {
        this.newInitialPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad newFinalPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewFinalPrice() {
        return newFinalPrice;
    }

    /**
     * Define el valor de la propiedad newFinalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewFinalPrice(BigDecimal value) {
        this.newFinalPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad newStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * Define el valor de la propiedad newStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatus(String value) {
        this.newStatus = value;
    }

}
