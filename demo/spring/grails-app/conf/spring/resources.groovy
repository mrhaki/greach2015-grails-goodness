// Place your Spring DSL code here

import greach.*
import grails.util.*

beans = {

    sampleBean(Sample) { 
        name = 'Greach Sample Bean'
    }

    Environment.executeForCurrentEnvironment {
        development {
            springConfig.addAlias 'devBean', 'sampleBean'
        }
        test {
            springConfig.addAlias 'testBean', 'sampleBean'

        }
        production {
            springConfig.addAlias 'productionBean', 'sampleBean'

        }
    }

}
