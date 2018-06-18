KOTLINC="../kotlinc/bin/kotlinc"
KOTLIN="../kotlinc/bin/kotlin"
CLASSPATH=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar

all:
	${KOTLINC} -cp "${CLASSPATH}" -d basicTest.jar basicTest.kt

test:
	java -cp "${CLASSPATH}:basicTest.jar" org.junit.runner.JUnitCore brymlee.test.Tests

kotlinc-help:
	${KOTLINC} -help

kotlin-help:
	${KOTLIN} -help

