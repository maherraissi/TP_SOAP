//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package com.example.currency;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.currency package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.currency
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertCurrencyRequest }
     * 
     * @return
     *     the new instance of {@link ConvertCurrencyRequest }
     */
    public ConvertCurrencyRequest createConvertCurrencyRequest() {
        return new ConvertCurrencyRequest();
    }

    /**
     * Create an instance of {@link ConvertCurrencyResponse }
     * 
     * @return
     *     the new instance of {@link ConvertCurrencyResponse }
     */
    public ConvertCurrencyResponse createConvertCurrencyResponse() {
        return new ConvertCurrencyResponse();
    }

}
