pipeline {
  agent any
  stages {
    stage("build app") {
      steps {
        echo 'start building...'
        cd app
        nodejs('Node-18.10.0') {
          sh 'npm install'  
        }
      }
    }
  }
}
