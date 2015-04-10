includeTargets << grailsScript('_GrailsInit')

eventIntegrateWithStart = {

    binding.integrateGreach = {

        def readme = new File('README.ad')

        readme.text = '''
        = Grails App

        == Introduction

        Sample Grails application for Greach 2015.
        '''.stripIndent()

        grailsConsole.updateStatus 'Created README.ad file.'
    }



}