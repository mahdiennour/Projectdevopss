pipeline {
    agent any

    stages {
        stage('Récupération du code de la branche') {
            steps {
                sh 'git clone https://github.com/mahdiennour/Projectdevopsssss.git' 
            }
        }

        stage('Nettoyage et compilation avec Maven') {
            steps {
                // Étape de nettoyage du projet
                sh "mvn clean"

                // Étape de compilation du projet
                sh "mvn compile"
                // Etape de sonar
            }
        }
      stage('MVN SONARQUBE'){
        steps {
            sh "mvn sonar:sonar -Dsonar.login=sqa_e4492648fef78c148ee0fd2a4a8c48325035e38c"
        }
      }
        stage('mvn deploy'){
            steps {
                sh "mvn deploy"
            }
        }
    }
}
