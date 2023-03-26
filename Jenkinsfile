pipeline {
  agent any
  tools { 
        maven 'MAVEN_HOME' 
        jdk 'JAVA_HOME' 
    }
    stages {
      stage('git repo & clean') {
          steps {
          
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