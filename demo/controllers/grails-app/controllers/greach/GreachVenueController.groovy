package greach

import grails.web.*

class GreachVenueController {

    def show() {
        def result = new Result(name: 'Greach')
        respond result, status: 201
    }
}


class Result {
    String name
}