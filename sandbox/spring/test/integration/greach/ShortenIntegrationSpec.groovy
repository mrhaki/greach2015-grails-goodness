package greach

import grails.test.spock.IntegrationSpec

class ShortenIntegrationSpec extends IntegrationSpec {
    
    Shorten shorten

    def "Return first letters for languages"() {
        expect:
        shorten.firstLetters() == 'GJS'
    }

}
