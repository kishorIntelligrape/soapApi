
package org.grails.cxf.soap;

import javax.annotation.Generated;
import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.6
 * 2014-10-05T15:45:34.454+05:30
 * Generated source version: 2.6.6
 */

@WebFault(name = "NoSuchCustomer", targetNamespace = "http://test.cxf.grails.org/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30", comments = "Apache CXF 2.6.6")
public class NoSuchCustomerException extends Exception {
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    private org.grails.cxf.soap.NoSuchCustomer noSuchCustomer;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public NoSuchCustomerException() {
        super();
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public NoSuchCustomerException(String message) {
        super(message);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public NoSuchCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public NoSuchCustomerException(String message, org.grails.cxf.soap.NoSuchCustomer noSuchCustomer) {
        super(message);
        this.noSuchCustomer = noSuchCustomer;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public NoSuchCustomerException(String message, org.grails.cxf.soap.NoSuchCustomer noSuchCustomer, Throwable cause) {
        super(message, cause);
        this.noSuchCustomer = noSuchCustomer;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.454+05:30")
    public org.grails.cxf.soap.NoSuchCustomer getFaultInfo() {
        return this.noSuchCustomer;
    }
}
