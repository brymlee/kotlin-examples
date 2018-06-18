KOTLINC="../kotlinc/bin/kotlinc"
CLASSPATH=../lib/hamcrest-all-1.3.jar:../lib/junit-4.12.jar
echo "Building..."
$KOTLINC -cp "${CLASSPATH}" -d filters.jar filters.kt
$KOTLINC -cp "${CLASSPATH}:filters.jar" -include-runtime -d tests.jar tests.kt
