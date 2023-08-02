pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'START: Build'
        sh 'mvn clean install'
        echo 'END: Build Success'
      }
    }

  }
}