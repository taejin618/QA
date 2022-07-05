//젠킨스 빌드 command//

//젠킨스 관리 -> 플러그인 관리 - > katalon plugin 설치

//카탈론 런타임 엔진 설치//

//젠킨스 빌드잡 free project 생성//

//빌드 환경에서 add build step 선택 후 Exeute katalon studio tests 선택//

//Use pre-installed katalon studio 항목에 런타임 엔진 설치된 경로 입력 ex.C:\Users\taejin618\.katalon\.katalon//

//카탈론 실행 후 해당 프로젝트 빌드 command 확인//

//아래 시작점 부터 복사하여 command arguments 에 붙여 넣고 빌드 시작//

-projectPath="C:\Users\taejin618\Katalon Studio\CheckUp\CheckUp.prj" -retry=0 -testSuitePath="Test Suites/Test_1" -browserType="Chrome" -executionProfile="default" -apiKey="f7739fa0-1934-40bd-a24a-4a48f2031974" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true



