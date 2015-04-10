// Place your Spring DSL code here
import grails.rest.render.json.*
import greach.*

beans = {

    jsonCourseCollectionRenderen(JsonCollectionRenderer, Course)

}
