CLASSPATH_WINDOWS=..\\lib\\hamcrest-all-1.3.jar:..\\lib\\junit-4.12.jar
CLASSPATH_LINUX=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar
KOTLINC="../kotlinc/bin/kotlinc"

nothing:
	echo "You must select run-windows or run-linux."

run-windows: build-windows
	java -cp "${CLASSPATH_WINDOWS}:generics.jar:tests.jar" org.junit.runner.JUnitCore brymlee.Tests

build-windows:
	${KOTLINC} -cp "${CLASSPATH_WINDOWS}" -d generics.jar generics.kt
	${KOTLINC} -cp "${CLASSPATH_WINDOWS}:generics.jar" -include-runtime -d tests.jar tests.kt

run-linux: build-linux
	java -cp "${CLASSPATH_LINUX}:generics.jar:tests.jar" org.junit.runner.JUnitCore brymlee.Tests

build-linux:
	${KOTLINC} -cp "${CLASSPATH_LINUX}" -d generics.jar generics.kt
	${KOTLINC} -cp "${CLASSPATH_LINUX}:generics.jar" -include-runtime -d tests.jar tests.kt



