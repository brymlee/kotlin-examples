KOTLINC="../kotlinc/bin/kotlinc"
echo "Building..."
$KOTLINC -include-runtime -d hello-world.jar hello-world.kt
