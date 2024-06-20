pipeline {
    agent none
    stages {
        stage('Build') {
            agent {
             docker { image 'maven:3.8.5-openjdk-17-slim' }
             }
            steps {
                echo 'Hello, Maven'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run') {
            agent {
            docker { image 'eclipse-temurin:17-jre-alpine' }
            }
            steps {
                echo 'Hello, JDK'
                sh 'java -jar target/tomcat-spring-demo-v2-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}