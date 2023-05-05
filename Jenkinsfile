pipeline {
    agent any

    tools {
        maven 'M3' // Specify the Maven installation name configured in your Jenkins
        jdk 'JDK17' // Specify the JDK installation name configured in your Jenkins
		oc 'oc'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/raziqtechnologies/devops.git' // Replace with your Git repository URL
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}