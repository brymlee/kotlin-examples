CLASSPATH_WINDOWS=..\\lib\\hamcrest-all-1.3.jar:..\\lib\\junit-4.12.jar
CLASSPATH_LINUX=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar
KOTLINC="../kotlinc/bin/kotlinc"

nothing:
	echo "You must select run-windows or run-linux."

run-windows: build-windows
	java -cp "${CLASSPATH_WINDOWS}:basicTest.jar" org.junit.runner.JUnitCore brymlee.test.Tests

build-windows:
	${KOTLINC} -cp "${CLASSPATH_WINDOWS}" -include-runtime -d basicTest.jar basicTest.kt

run-linux: build-linux
	java -cp "${CLASSPATH_LINUX}:basicTest.jar" org.junit.runner.JUnitCore brymlee.test.Tests

build-linux:
	${KOTLINC} -cp "${CLASSPATH_LINUX}" -include-runtime -d basicTest.jar basicTest.kt




