
package com.training.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BLZServicePortType", targetNamespace = "http://thomas-bayer.com/blz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BLZServicePortType {


    /**
     * 
     * @param blz
     * @return
     *     returns com.training.client.DetailsType
     */
    @WebMethod
    @WebResult(name = "details", targetNamespace = "http://thomas-bayer.com/blz/")
    @RequestWrapper(localName = "getBank", targetNamespace = "http://thomas-bayer.com/blz/", className = "com.training.client.GetBankType")
    @ResponseWrapper(localName = "getBankResponse", targetNamespace = "http://thomas-bayer.com/blz/", className = "com.training.client.GetBankResponseType")
    public DetailsType getBank(
        @WebParam(name = "blz", targetNamespace = "http://thomas-bayer.com/blz/")
        String blz);

}
