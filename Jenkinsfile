pipeline {
  agent any
  tools { 
        maven 'apache-maven-3.8.7' 
        jdk 'jdk-11.0.17' 
    }
    stages {
      stage('git repo & clean') {
          steps {
          
             bat "rmdir /s /q stock-service"
             bat "git clone https://github.com/Kiran-baghel2022/stock-service.git"
             bat "mvn clean -f stock-service"
          
          }
       }
       stage('install') {
         steps {
             bat "mvn install -f stock-service"
          
          }
         
       }
       stage('test') {
         steps {
             bat "mvn test -f stock-service"
          }
       }
       stage('package') {
         steps {
             bat "mvn package -f stock-service"
          }
       }
    
    }

}