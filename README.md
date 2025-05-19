# Service Web SOAP de Conversion de Devises

## Description
Ce projet implémente un service web SOAP simple utilisant Spring Boot pour convertir des montants d'une devise à une autre. Il sert d'exemple pour la création de services web basés sur SOAP avec Spring Web Services.

## Technologies Utilisées
*   Spring Boot
*   Spring Web Services
*   Apache Maven
*   JAXB (Java Architecture for XML Binding)
*   Java 17

## Structure du Projet
La structure principale du projet est la suivante :
```
currency-converter-service
│
├───src
│ ├───main
│ │ ├───java
│ │ │ └───com
│ │ │ └───example
│ │ │ └───currency
│ │ │ ├───endpoint
│ │ │ │ └───CurrencyConverterEndpoint.java
│ │ │ ├───config
│ │ │ │ └───WebServiceConfig.java
│ │ │ └───CurrencyConverterServiceApplication.java
│ │ └───resources
│ │ ├───currency-converter.xsd
│ │ └───application.properties
│ └───test
│ └───java
│ └───com
│ └───example
│ └───currency
│ └───CurrencyConverterServiceApplicationTests.java
├───pom.xml
└───README.md
```

## Services Web Utilisés
Ce projet implémente un service web SOAP unique basé sur la définition du schéma XML (`currency-converter.xsd`).

*   **Endpoint SOAP :** `/ws`
*   **Fichier WSDL :** `/ws/currencyConverter.wsdl` (accessible lorsque l'application est en cours d'exécution)

Le service exposé est `ConvertCurrency`, qui prend en entrée un montant, une devise de départ et une devise cible, et retourne le montant converti.

## Prérequis
Assurez-vous d'avoir les éléments suivants installés :
*   Java Development Kit (JDK) version 17 ou supérieure
*   Apache Maven

## Comment Construire et Exécuter le Projet

1.  Naviguez vers le répertoire du projet `currency-converter-service` dans votre terminal.
2.  Exécutez la commande Maven suivante pour générer les classes Java à partir du schéma XSD et construire le projet :
    ```bash
    mvn clean install
    ```
3.  Exécutez l'application Spring Boot en utilisant la commande Maven :
    ```bash
    mvn spring-boot:run
    ```
    L'application démarrera généralement sur `http://localhost:8080`.

## Comment Tester le Service SOAP

Vous pouvez tester le service SOAP à l'aide d'outils comme SoapUI ou Postman.

*   **URL du WSDL :** `http://localhost:8080/ws/currencyConverter.wsdl`
*   **URL de l'Endpoint SOAP :** `http://localhost:8080/ws`

### Exemple de Requête SOAP
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:cur="http://example.com/currency">
   <soapenv:Header/>
   <soapenv:Body>
      <cur:ConvertCurrencyRequest>
         <cur:fromCurrency>USD</cur:fromCurrency>
         <cur:toCurrency>EUR</cur:toCurrency>
         <cur:amount>100.00</cur:amount>
      </cur:ConvertCurrencyRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

### Exemple de Réponse SOAP
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <ns2:ConvertCurrencyResponse xmlns:ns2="http://example.com/currency">
         <ns2:convertedAmount>90.0</ns2:convertedAmount>
      </ns2:ConvertCurrencyResponse>
   </soapenv:Body>
</soapenv:Envelope>
```

Pour utiliser SoapUI ou Postman, importez le WSDL `http://localhost:8080/ws/currencyConverter.wsdl` pour générer automatiquement des requêtes de test. Configurez ensuite le corps de la requête avec l'exemple ci-dessus et envoyez-la à l'URL de l'endpoint. 
