pipeline {
    agent any

    stages {
        stage('Récupération du code de la branche') {
            steps {
                sh 'git clone https://github.com/mahdiennour/Projetops.git' 
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
            sh "mvn sonar:sonar -Dsonar.login=sqa_5abd7e1685ae9967c22f23a14eaef9ec1be0c14d"
        }
      }
    }
}
