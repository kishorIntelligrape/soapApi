package org.soap.test

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl
import org.grails.cxf.test.soap.Customer
import org.grails.cxf.test.soap.CustomerService
import org.grails.cxf.test.soap.CustomerType

import javax.xml.datatype.DatatypeConstants
import org.grails.cxf.utils.EndpointType

class CustomerServiceEndpoint implements CustomerService {


    static expose = EndpointType.SIMPLE

    static List<Customer> CUSTOMERS = [
            new Customer(name: 'Frank', address: ['1234 Awesomeness St.', 'Chochokacho, Toast'], numOrders: 5,
                         revenue: 630.00d, test: new BigDecimal("50.123"), type: CustomerType.PRIVATE,
//                         birthDate: XMLGregorianCalendarImpl.createDate(2012, 12, 07, DatatypeConstants.FIELD_UNDEFINED)
                         birthDate: new Date(2012,11,02)
            ),
            new Customer(name: 'Super Duper', address: ['999 Numbers Ave.', 'Double, Toast'], numOrders: 1,
                         revenue: 10.00d, test: new BigDecimal("12"), type: CustomerType.BUSINESS,
//                         birthDate: XMLGregorianCalendarImpl.createDate(2012, 12, 07, DatatypeConstants.FIELD_UNDEFINED)
                         birthDate: new Date(2012,10,12)
            ),

    ]

    List<Customer> getCustomersByName(final String name) {
        CUSTOMERS.each {
            println("${it.dump()}")
        }
        CUSTOMERS.findAll { it.name == name }
    }

}