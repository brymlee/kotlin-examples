KOTLINC="../kotlinc/bin/kotlinc"
KOTLIN="../kotlinc/bin/kotlin"
CLASSPATH=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar

all:
	${KOTLINC} -cp "${CLASSPATH}" -d pojos.jar pojos.kt
	${KOTLINC} -cp "${CLASSPATH}:pojos.jar" -include-runtime -d tests.jar tests.kt

test:
	java -cp "${CLASSPATH}:pojos.jar:tests.jar" org.junit.runner.JUnitCore brymlee.Tests

kotlinc-help:
	${KOTLINC} -help

kotlin-help:
	${KOTLIN} -help

