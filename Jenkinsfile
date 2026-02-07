pipeline {
    agent any

    tools {
        jdk 'jdk-default'      // matches name in Jenkins config
        maven 'maven3'         // matches name in Jenkins config
    }

    stages {
        stage('Checkout') {
            steps { checkout scm }
        }

        stage('Build & Test') {
            steps { sh 'mvn clean install' }
        }

        stage('Cucumber Report') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                        reportTitle: 'Automation Test Report',
                        fileIncludePattern: '**/cucumber*.json'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
