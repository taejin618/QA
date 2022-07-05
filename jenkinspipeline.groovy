// 태진 API key
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat """
                cd  C:/Users/taejin618/.katalon/.katalon
                katalonc  -projectPath="C:/Users/taejin618/KatalonStudio/CheckUp/CheckUp.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test_1" -apiKey="f7739fa0-1934-40bd-a24a-4a48f2031974"
               """
            }
        }

    }
}


// 수석님 API key
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat """
                cd  C:/Users/taejin618/.katalon/.katalon
                katalonc  -projectPath="C:/Users/taejin618/Katalon Studio/CheckUp/CheckUp.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test Suite_1" -apiKey="f2cc6a94-2a4a-4435-b15a-9c0911989ada"
               """
            }
        }

    }
}

// pipeline {
//     agent any
//     stages {
//         stage('Test') {
//             steps {
//                 bat """
//                 cd  C:/Users/taejin618/.katalon/.katalon #런타임 엔진 설치된 경로
//                 katalonc  -projectPath="C:/Users/taejin618/Katalon Studio/CheckUp/CheckUp.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test Suite_1" -apiKey="f2cc6a94-2a4a-4435-b15a-9c0911989ada"
//                """
//             }
//         }

//     }
// }

// 성공
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat """
                cd  C:/Users/taejin618/.katalon/.katalon
                katalonc  -projectPath="C:/Users/taejin618/KatalonStudio/CheckUp/CheckUp.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test" -apiKey="f2cc6a94-2a4a-4435-b15a-9c0911989ada"
               """
            }
        }

    }
}

// 성공
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat """
                cd  C:/Users/taejin618/.katalon/.katalon
                katalonc  -projectPath="C:/Users/taejin618/KatalonStudio/test/test.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/suite" -apiKey="f2cc6a94-2a4a-4435-b15a-9c0911989ada"
               """
            }
        }

    }
}