all:
	unzip kotlin-compiler-1.2.50.zip
	javac Install.java
	java -cp "." Install

clean:
	java -cp "." Install "clean"

