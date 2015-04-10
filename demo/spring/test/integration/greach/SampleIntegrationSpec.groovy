package greach

import grails.test.spock.IntegrationSpec

class SampleIntegrationSpec extends IntegrationSpec {

    def sampleBean

    def "sampleBean should have name"() {

        expect: 
        sampleBean.name == 'invalid'
    }
}
