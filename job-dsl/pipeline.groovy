pipelineJob('CI/pipeline-job') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/kolangiraja123/test.git')
                    }
                    branches('*/main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

