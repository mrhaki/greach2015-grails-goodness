package greach

import grails.transaction.Transactional

@Transactional
class LanguagesService {

    
    def languages() {
        ['Groovy', 'Scala', 'Java']
    }
}
