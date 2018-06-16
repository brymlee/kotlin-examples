all: kotlin-compiler-1.2.50 openjdk-10.0.1_windows-x64_bin.tar.gz openjdk-10.0.1_windows-x64_bin

kotlin-compiler-1.2.50:
	unzip kotlin-compiler-1.2.50.zip

openjdk-10.0.1_windows-x64_bin.tar.gz:
	curl -O https://download.java.net/java/GA/jdk10/10.0.1/fb4372174a714e6b8c52526dc134031e/10/openjdk-10.0.1_windows-x64_bin.tar.gz

openjdk-10.0.1_windows-x64_bin:
	tar -zxvf openjdk-10.0.1_windows-x64_bin.tar.gz

