package greach

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component 
class Shorten {

    private final LanguageService languageService

    @Autowired
    Shorten(final LanguageService languageService) {
        this.languageService = languageService
    }

    String firstLetters() {
        languageService.languages().collect { it[0] }.join()
    }


}