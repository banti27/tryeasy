pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'START: Build'
        sh 'mvnw clean install'
        echo 'END: Build Success'
      }
    }

  }
}
