pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the GitHub repo
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // Run Maven clean install
                sh 'mvn clean install'
            }
        }

        stage('Cucumber Report') {
            steps {
                // Generate Cucumber report if JSON exists
                cucumber buildStatus: 'UNSTABLE',
                        reportTitle: 'Automation Test Report',
                        fileIncludePattern: '**/cucumber*.json'
            }
        }
    }

    post {
        always {
            // Archive artifacts like JARs
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true

            // Publish JUnit reports if generated
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
