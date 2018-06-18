KOTLINC="../kotlinc/bin/kotlinc"
CLASSPATH=..\\lib\\hamcrest-all-1.3.jar:..\\lib\\junit-4.12.jar
echo "Building..."
$KOTLINC -cp "${CLASSPATH}" -d basicTest.jar basicTest.kt
