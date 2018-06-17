KOTLINC="../kotlinc/bin/kotlinc"
KOTLIN="../kotlinc/bin/kotlin"
JAVA="../jdk-10.0.1/bin/java"
CLASSPATH=..\lib\hamcrest-all-1.3.jar:..\lib\junit-4.12.jar

all:
	${KOTLINC} -cp "${CLASSPATH}" -d basicTest.jar basicTest.kt

test:
	${JAVA} -cp "${CLASSPATH}:basicTest.jar" org.junit.runner.JUnitCore brymlee.test.Tests

kotlinc-help:
	${KOTLINC} -help

kotlin-help:
	${KOTLIN} -help

