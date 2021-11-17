pipeline {
  agent any

  triggers {
    pollSCM '* * * * *'
  }
  stages {
    stage('Build') {
      steps {
        sh 'chmod +x ./gradlew'
        sh './gradlew assemble'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Build Docker image') {
      steps {
        sh './gradlew docker'
      }
    }
    stage('Push Docker image') {
      environment {
        DOCKER_HUB_LOGIN = credentials('docker-hub')
      }
      steps {
        sh 'docker login --username=$DOCKER_HUB_LOGIN_USR --password=$DOCKER_HUB_LOGIN_PSW'
        sh './gradlew dockerPush'
      }
    }
  }
  post {
    always {
      echo 'Post build actions'
      publishTestResults serverAddress: 'https://testdashboardwork.atlassian.net/jira',
        projectKey: 'TS',
        filePath: 'target/cucumber-reports/*.json',
        format: 'Cucumber',
        autoCreateTestCases: true
    }
  }
}