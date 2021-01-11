pipeline {
    agent any

    triggers {
        // Requires Github Plugin
        githubPush()
    }

    stages{
        stage('Build project Alpha'){
            when{
                changeset 'Alpha/**'
            }
            steps{
                build 'JenkinsExperiment-Alpha/'+env.BRANCH_NAME
            }
        }
        stage('Build project Beta'){
            when{
                changeset 'Beta/**'
            }
            steps{
                build 'JenkinsExperiment-Beta/'+env.BRANCH_NAME

            }
        }
    }
}