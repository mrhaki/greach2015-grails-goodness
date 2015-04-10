package greach

import grails.transaction.Transactional

@Transactional()
class LanguageService {

    def languages() {
        ['Groovy', 'Java', 'Scala', 'Clojure']
    }

}
