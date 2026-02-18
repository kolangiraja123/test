job('hello-world-job') {
    description('My first Job DSL job')

    triggers {
        scm('H/5 * * * *')
    }

    steps {
        echo("Hello from Job DSL!")
    }
}

