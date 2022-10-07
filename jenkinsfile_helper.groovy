def buildAppViaNpm() {
  echo 'start building...'
  nodejs('Node-18.10.0') {
    sh 'cd app && npm install'  
  }
}

return this
