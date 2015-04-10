package greach

import grails.test.spock.IntegrationSpec

class SampleBeanIntegrationSpec extends IntegrationSpec {

    Sample sample
    Sample anotherSample
    Sample devSample
    Sample testSample
    Sample aliasSample

    def "check sample bean"() {
        expect:
        sample.name == 'SampleBean'
    }

    def "check another sample bean"() {
        expect:
        anotherSample.name == 'Config value'
    }

    def "check dev sample bean"() {
        expect:
        devSample.name == 'Config value'
    }

    def "check test sample bean"() {
        expect:
        testSample.name == 'Config value'
    }


    def "check alias sample bean"() {
        expect:
        aliasSample.name == 'Config value'
    }

}
