package org.soap.test

import org.grails.cxf.utils.EndpointType

class DoctorEndpoint {
    static expose = EndpointType.JAX_WS
    static excludes = []

    String serviceMethod(String s) {
        return s
    }
}
