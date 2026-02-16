pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling code...'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging artifact...'
            }
        }
	}
post
	{

		success {
		echo 'Build succeeeded'
		}
		failure
		{
		echo 'Build failed'
		}
		always
		{ echo 'Pipeline finished'}
    	} 
   }



