package greach

import grails.rest.*

class CourseController extends RestfulController<Course> {
    static responseFormats = [
        show: ['xml']
    ]

    CourseController() {
        super(Course)
    }

    @Override
    def show() {
        respond queryForResource(params.id), [excludes: ['class'], includes: params.fields?.tokenize(',')]
    }

    @Override
    def index(final Integer max) {
        params.max = Math.min(max ?: 10, 100)

        respond listAllResources(params).toArray(), [includes: params.fields?.tokenize(','), excludes: ['class']]
    }
}
