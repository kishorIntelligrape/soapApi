// Place your Spring DSL code here

import org.grails.cxf.logging.CustomLoggingOutInterceptor
import org.grails.cxf.logging.VerboseCustomLoggingInInterceptor
import org.grails.cxf.test.soap.interceptor.CustomLoggingInInterceptor
import org.grails.cxf.test.soap.interceptor.InjectedBean

beans = {
    customLoggingInInterceptor(CustomLoggingInInterceptor) {
        name = "customLoggingInInterceptor"
    }
    verboseLoggingInInterceptor(VerboseCustomLoggingInInterceptor) {
        name = "verboseLoggingInInterceptor"
    }

    customLoggingOutInterceptor(CustomLoggingOutInterceptor) {
        name = "customLoggingOutInterceptor"
    }
    injectedBean(InjectedBean) { bean ->
        bean.autowire = 'byName'
        name = "i was injected"
    }
}
