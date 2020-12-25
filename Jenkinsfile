pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '/usr/local/Cellar/gradle/6.7.1/bin/gradle build'
      }
    }

    stage('test') {
      steps {
        sh '/usr/local/Cellar/gradle/6.7.1/bin/gradle test'
      }
    }

  }
}