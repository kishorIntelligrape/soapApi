package org.soap.test

import org.grails.cxf.utils.EndpointType

//this SHOULD get wired up as a service as it has the expose static property
class CarService {

    static expose = [EndpointType.SIMPLE]
    static excludes = ['dontHonk']

    String honkHorn() {
        'HONK'
    }

    String dontHonk(){
        'BEEP'
    }

    String stop(){
        'BRAKES'
    }

    String start(String s){
        println("start is been called ${s}")
        "GAS ${s}"
    }
}
