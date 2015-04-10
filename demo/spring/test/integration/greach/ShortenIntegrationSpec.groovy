package greach

import grails.test.spock.IntegrationSpec

class ShortenIntegrationSpec extends IntegrationSpec {

    Shorten shorten

    def "shorten should return first letters"() {
        expect:
        shorten.shorten() == 'GSJ'
    }
}
