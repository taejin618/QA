pipeline {
    agent any
        stages {
        stage('Test') {
            steps {
                dir('C:\\Users\\taejin618\\katalonstudio\\test'){
                    bat 'docker run -t --rm  -m 4096m --cpus=2  -v %CD%:/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/suite" -apiKey=f2cc6a94-2a4a-4435-b15a-9c0911989ada'
                }
            }
        }
    }
}