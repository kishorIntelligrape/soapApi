package filter

class RequestFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println("param ${params}")
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }

    }
}
