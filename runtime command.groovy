터미널 실행 후 카탈론 런타임 엔진 설치된 경로 진입 ex.C:\Users\taejin618\.katalon\.katalon

카탈론 실행 후 빌드 커맨드 복사하여 터미널에 입력 후 실행

./katalonc -noSplash -runMode=console -projectPath="C:\Users\taejin618\KatalonStudio\CheckUp\CheckUp.prj" -retry=0 -testSuitePath="Test Suites/Test_1" -browserType="Chrome" -executionProfile="default" -apiKey="f7739fa0-1934-40bd-a24a-4a48f2031974" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true
