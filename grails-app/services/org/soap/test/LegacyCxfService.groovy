package org.soap.test

class LegacyCxfService {

    static expose = ['cxf']

    String legacyMethod(String param) {
        return "legacy ${param}".toString()
    }
}
