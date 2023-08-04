pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'START: Build'
        bat './mvnw.bat clean install'
        echo 'END: Build Success'
      }
    }

  }
}