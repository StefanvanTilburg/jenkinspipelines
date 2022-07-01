pipeline {
    agent { label 'jenkins_agent' }
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', daysToKeepStr: '', numToKeepStr: '5')
        disableConcurrentBuilds()
    }
    stages {
        stage('Hello') {
        steps {
                echo "hello"
            }
        }
        stage('cat README') {
            when {
                branch "DEV/*"
            }
            steps {
                sh '''
                    cat README.md
                '''
            }
        }
    }
}
