package greach

import grails.web.*

class SampleController {

    def index(@RequestParameter('greach') Double other) { 
        final Integer pages = params.int('pages')

        final Date date = params.date('dateString', 'dd-MM-yyyy')

        final Double number = params.double('number', 42.0)


        header 'X-Greach-2015', 'Is a party!'

        final result = new Result(number: other)

        respond result, [status: 201]
    }
}

class Result {
    Double number
}