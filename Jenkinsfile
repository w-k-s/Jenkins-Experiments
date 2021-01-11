pipeline {
    agent any

    triggers {
        pollSCM('*/10 * * * *') //polling for changes, here once a minute
    }

    stages{
        stage('Build project Alpha'){
            when{
                changeset 'Alpha/**'
            }
            step{
                build 'Alpha'
            }
        }
        stage('Build project Beta'){
            when{
                changeset 'Beta/**'
            }
            step{
                build 'Beta'
            }
        }
    }
}