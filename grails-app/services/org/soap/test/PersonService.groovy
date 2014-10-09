package org.soap.test

import org.grails.cxf.utils.EndpointType

import javax.jws.WebMethod
import javax.jws.WebParam

class PersonService {
    static expose = EndpointType.JAX_WS
    static excludes = []

    @WebMethod
    String getPersonInformation(@WebParam(name = "param")Long id) {
        return 'Person'
    }

    @WebMethod
    String serviceMethod(@WebParam(name = "param")String s) {
        println("serviceMethod ${s}")
        s
    }
}
