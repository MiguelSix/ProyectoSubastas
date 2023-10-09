//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.09 a las 01:24:24 PM CST 
//


package com.itq.auctionService.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itq.autoService.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itq.autoService.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auction }
     * 
     */
    public Auction createAuction() {
        return new Auction();
    }

    /**
     * Create an instance of {@link CreateAuction }
     * 
     */
    public CreateAuction createCreateAuction() {
        return new CreateAuction();
    }

    /**
     * Create an instance of {@link DeleteAuction }
     * 
     */
    public DeleteAuction createDeleteAuction() {
        return new DeleteAuction();
    }

    /**
     * Create an instance of {@link ConsultAuction }
     * 
     */
    public ConsultAuction createConsultAuction() {
        return new ConsultAuction();
    }

    /**
     * Create an instance of {@link UpdateAuction }
     * 
     */
    public UpdateAuction createUpdateAuction() {
        return new UpdateAuction();
    }

    /**
     * Create an instance of {@link Ack }
     * 
     */
    public Ack createAck() {
        return new Ack();
    }

}
