pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'START: Build'
        bat 'mvnw clean install'
        echo 'END: Build Success'
      }
    }
    stage('Deploy') {
          steps {
            bat 'mvnw spring-boot:run'
          }
    }

  }
}