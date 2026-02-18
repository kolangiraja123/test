job('CI/sample-ci-job') {
    description('CI job created using Job DSL')

    scm {
        git {
            remote {
                url('https://github.com/kolangiraja123/test.git')
            }
            branches('*/main')
        }
    }

    steps {
        shell('mvn clean test')
    }
}

