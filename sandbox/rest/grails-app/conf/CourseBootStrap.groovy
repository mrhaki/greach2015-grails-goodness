import greach.*

class CourseBootStrap {

    def init = { servletContext ->
        def course = new Course(name: 'Greach', location: 'Madrid')
        course.save(failOnSave: true)
    }


    def destroy = {
    }
}
