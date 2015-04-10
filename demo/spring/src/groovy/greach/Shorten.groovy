package greach

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component 
class Shorten {

    @Autowired
    LanguagesService languagesService

    def shorten() {
        languagesService.languages().collect { it[0] }.join()
    }
}
