pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Mithila7777/jenkins-java-app.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t jenkins-java-app:latest .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker rm -f jenkins-java-container || true'
                sh 'docker run -d --name jenkins-java-container -p 8081:8080 jenkins-java-app:latest'
            }
        }
    }
}
