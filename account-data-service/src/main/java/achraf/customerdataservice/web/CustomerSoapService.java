package achraf.customerdataservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2024-05-14T23:12:50.251+01:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://web.customerdataservice.achraf/", name = "CustomerSoapService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerSoapService {

    @WebMethod
    @RequestWrapper(localName = "saveCustomer", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.SaveCustomer")
    @ResponseWrapper(localName = "saveCustomerResponse", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.SaveCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public achraf.customerdataservice.web.Customer saveCustomer(

        @WebParam(name = "customer", targetNamespace = "")
        achraf.customerdataservice.web.CustomerRequest customer
    );

    @WebMethod
    @RequestWrapper(localName = "allCustomers", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.AllCustomers")
    @ResponseWrapper(localName = "allCustomersResponse", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.AllCustomersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<achraf.customerdataservice.web.Customer> allCustomers()
;

    @WebMethod
    @RequestWrapper(localName = "customerById", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.CustomerById")
    @ResponseWrapper(localName = "customerByIdResponse", targetNamespace = "http://web.customerdataservice.achraf/", className = "achraf.customerdataservice.web.CustomerByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public achraf.customerdataservice.web.Customer customerById(

        @WebParam(name = "id", targetNamespace = "")
        java.lang.Long id
    );
}
