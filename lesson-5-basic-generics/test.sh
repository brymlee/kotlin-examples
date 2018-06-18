CLASSPATH=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar
java -cp "${CLASSPATH}:generics.jar:tests.jar" org.junit.runner.JUnitCore brymlee.Tests
