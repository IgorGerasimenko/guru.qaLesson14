
### Всем привет! 
Локальный запуск Веб Тестов:
gradle clean -Dremote=local test --tests "tests.WebTests" 

Удаленный запуск Веб Тестов:
gradle clean test -Dremote=remote test --tests "tests.WebTests"

Запуск API тестов:
gradlew clean  test --tests "tests.ApiTests"


