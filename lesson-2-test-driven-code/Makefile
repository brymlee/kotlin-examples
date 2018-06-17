KOTLINC="../kotlinc/bin/kotlinc"
KOTLIN="../kotlinc/bin/kotlin"
JAVA="../jdk-10.0.1/bin/java"
CLASSPATH=..\lib\hamcrest-all-1.3.jar:..\lib\junit-4.12.jar

all:
	${KOTLINC} -cp "${CLASSPATH}" -d filters.jar filters.kt
	${KOTLINC} -cp "${CLASSPATH}:filters.jar" -include-runtime -d tests.jar tests.kt

test:
	${JAVA} -cp "${CLASSPATH}:filters.jar:tests.jar" org.junit.runner.JUnitCore brymlee.Tests

kotlinc-help:
	${KOTLINC} -help

kotlin-help:
	${KOTLIN} -help

