pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages{
        stage('Build project Alpha'){
            when{
                changeset 'Alpha/**'
            }
            steps{
                build 'Alpha'
            }
        }
        stage('Build project Beta'){
            when{
                changeset 'Beta/**'
            }
            steps{
                build 'Beta'
            }
        }
    }
}