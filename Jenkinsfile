def gv

pipeline {
  agent any
  
  parameters {
    booleanParam(name: 'dryRun', defaultValue: false, description: 'Whether to skip npm install stage')
  }
  
  stages {
    stage("init) {
      steps {
        script {
          gv = load 'jenkinsfile_helper.groovy'
        }
      }    
    }
    
    stage("build app") {
      when {
        expression {
          !params.dryRun
        }
      }
      steps {
        script {
          gv.buildAppViaNpm()
        }
      }
    }
    
    stage("final stage") {
      steps {
        echo 'This is a dummy final stage :P'
      }
    }
  }
}
