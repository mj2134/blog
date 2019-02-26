pipeline{
  agent any
  stages{
    stage('hello build'){
      steps{
        echo 'hello build'
      }
    }
  }
}
