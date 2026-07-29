pipeline {

     agent any

     tools {
         jdk 'jdk17'
         maven 'Maven-3.9.16'
     }

     stages {

         stage('Checkout') {
             steps {
                 git branch: 'master',
                     url: 'https://github.com/ayoracle/hello_world'
             }
         }


         stage('Build') {
             steps {
                 bat 'mvn clean package'
             }
         }


         stage('Test') {
             steps {
                 bat 'mvn test'
             }
         }


         stage('Archive WAR') {
             steps {
                 archiveArtifacts artifacts: 'target/*.war',
                 fingerprint: true
             }
         }


 //     stage('Deploy to Tomcat') {
 //         steps {
 //             bat '''
 //             copy /Y target\\CICD-Demo-RestAPI-0.0.1-SNAPSHOT.war "C:\\Users\\Yogesh Toshniwal\\Documents\\Dependency\\apache-tomcat-10.1.57\\webapps\\CICD-Demo-RestAPI-0.0.1-SNAPSHOT.war"
 //             '''
 //         }
 //     }
 stage('Deploy to Tomcat') {
     steps {
         bat '''
         del /F /Q "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\HelloWorldWebApp-0.0.1-SNAPSHOT.war" 2>nul
         rmdir /S /Q "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\HelloWorldWebApp-0.0.1-SNAPSHOT" 2>nul
         copy /Y target\HelloWorldWebApp-0.0.1-SNAPSHOT.war "C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps\HelloWorldWebApp.war"
         '''
     }
 }


     }
 }