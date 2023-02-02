pipeline {
  any agent
    stages {
      stage('git repo & clean') {
          steps {
          
             bat "rmdir /s /q stock-service"
             bat "git clone "
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