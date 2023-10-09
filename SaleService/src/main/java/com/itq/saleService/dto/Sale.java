//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.08 a las 12:27:42 PM CST 
//


package com.itq.saleService.dto;

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
 *         &lt;element name="saleID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="productQuantity"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productPrice"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="total"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="saleDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{2}-[0-9]{2}-[0-9]{4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="vendida"/&gt;
 *               &lt;enumeration value="libre"/&gt;
 *               &lt;enumeration value="en_proceso"/&gt;
 *               &lt;enumeration value="cancelada"/&gt;
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
    "saleID",
    "clientID",
    "providerID",
    "productID",
    "productQuantity",
    "productPrice",
    "total",
    "saleDate",
    "status"
})
@XmlRootElement(name = "sale")
public class Sale {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String saleID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String clientID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String providerID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String productID;
    protected int productQuantity;
    @XmlElement(required = true)
    protected BigDecimal productPrice;
    @XmlElement(required = true)
    protected BigDecimal total;
    @XmlElement(required = true)
    protected String saleDate;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtiene el valor de la propiedad saleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleID() {
        return saleID;
    }

    /**
     * Define el valor de la propiedad saleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleID(String value) {
        this.saleID = value;
    }

    /**
     * Obtiene el valor de la propiedad clientID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Define el valor de la propiedad clientID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Obtiene el valor de la propiedad providerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Define el valor de la propiedad providerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Obtiene el valor de la propiedad productID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Define el valor de la propiedad productID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Obtiene el valor de la propiedad productQuantity.
     * 
     */
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * Define el valor de la propiedad productQuantity.
     * 
     */
    public void setProductQuantity(int value) {
        this.productQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad productPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * Define el valor de la propiedad productPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPrice(BigDecimal value) {
        this.productPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad saleDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * Define el valor de la propiedad saleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDate(String value) {
        this.saleDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
