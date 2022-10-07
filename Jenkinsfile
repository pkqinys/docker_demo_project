pipeline {
  agent any
  
  parameters {
    booleanParam(name: 'dryRun', defaultValue: false, description: 'Whether to skip npm install stage')
  }
  
  stages {
    stage("build app") {
      when {
        expression {
          !params.dryRun
        }
      }
      steps {
        echo 'start building...'
        nodejs('Node-18.10.0') {
          sh 'cd app && npm install'  
        }
      }
    }
  }
}
