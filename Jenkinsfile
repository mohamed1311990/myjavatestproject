pipeline {
     tools { maven 'mvn'  }
     agent any
     stages {
      stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' }
      }
      stage('deploy')
             {
                  
        }
    }
}
