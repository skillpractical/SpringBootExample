pipeline {
	agent any
	stages {
		stage('Welcomee') {
			steps {
				echo 'Welcome to SkillPractical!'
			}
		}
		
		stage('Proceed') {
			steps {
				input('Do you want to proceed?')
			}
		}
		
		stage('Build') {
            steps {
                bat './gradlew build'
            }
        }
        
        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }
        
        stage('Check') {
            steps {
                bat './gradlew check'
            }
        }      
		
		stage('Finish') {
			steps {
				'Finished'
			}
		}		
	}
}
