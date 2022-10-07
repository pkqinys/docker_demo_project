pipeline {
  agent any
  stages {
    stage("build app") {
      steps {
        echo 'start building...'
        nodejs('Node-18.10.0') {
          sh 'cd app && npm install'  
        }
      }
    }
  }
}
