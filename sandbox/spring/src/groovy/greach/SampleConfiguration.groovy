package greach

import org.springframework.beans.factory.annotation.*
import org.springframework.context.annotation.*
import org.codehaus.groovy.grails.commons.*

@Configuration
class SampleConfiguration {

    @Autowired
    @Qualifier('grailsApplication')
    def grailsApplication

    @Bean Sample sample() {
        new Sample('SampleBean')
    }

    @Bean 
    @Profile("test")
    Sample anotherSample() {
        new Sample(grailsApplication.config.sample.name)
    }

}