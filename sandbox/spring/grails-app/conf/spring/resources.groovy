import grails.util.*

beans = {

    Environment.executeForCurrentEnvironment {
        test {
            testSample(greach.Sample, 'Greach sample')
        }
        development {
            devSample(greach.Sample, 'Dev sample')
        }
    }


    springConfig.addAlias 'aliasSample', 'testSample'

}
