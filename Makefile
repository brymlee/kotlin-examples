all: kotlin-compiler-1.2.50 openjdk-10.0.1_windows-x64_bin.tar.gz jdk-10.0.1 lib

kotlin-compiler-1.2.50:
	unzip kotlin-compiler-1.2.50.zip

openjdk-10.0.1_windows-x64_bin.tar.gz:
	curl -O https://download.java.net/java/GA/jdk10/10.0.1/fb4372174a714e6b8c52526dc134031e/10/openjdk-10.0.1_windows-x64_bin.tar.gz

openjdk-10.0.1_windows-x64_bin:
	tar -zxvf openjdk-10.0.1_windows-x64_bin.tar.gz

lib:
	mkdir lib
	curl -o lib/junit-4.12.jar http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
	curl -o lib/hamcrest-all-1.3.jar http://central.maven.org/maven2/org/hamcrest/hamcrest-all/1.3/hamcrest-all-1.3.jar 
