젠킨스 파이프라인 빌드잡 생성

파이프라인 definition 선택

아래 파이프라인 스크립트 입력

pipeline {
    agent any
    stages {
//          빌드 실행 이름 ('test') 안에 설정
        stage('Test') {
            steps {
//          window 는 bat 입력 mac, 리눅스는 구문 상이하여 확인 필요 (sh)
                bat """
//                 카탈론 런타임 엔진 설치된 경로 지정
                    cd  C:/Users/taejin618/.katalon/.katalon
    //                 카탈론 자동화 실행 할 프로젝트 폴더 지정                                       " 실행할 브라우저 지정  "                    "테스트 스윗 폴더 경로 및 테스트 스윗명 지정" "api key 입력"
                katalonc  -projectPath="C:/Users/taejin618/KatalonStudio/CheckUp/CheckUp.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Test_1" -apiKey="f7739fa0-1934-40bd-a24a-4a48f2031974"
               """
            }
        }

    }
}


//예시
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


// 성공 파이프라인 스크립트
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
