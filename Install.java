import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.Arrays.*;

public class Install{

	public static void main(final String[] arguments) throws Exception{
		final List<String> lessonDirectories = asList(new File(".").listFiles())
			.stream()
			.filter(file -> file.isDirectory())
			.filter(file -> file.getName().contains("lesson-"))
			.map(file -> file.getName())
			.collect(toList());
		if(arguments.length == 1 && arguments[0].equals("clean")){
			lessonDirectories
				.stream()
				.map(file -> asList(new File(file).listFiles()))
				.map(files -> files
					.stream()
					.filter(file -> file.getName().equals("make") || file.getName().equals("make.exe"))
					.filter(file -> file.exists())
					.collect(toList()))
				.forEach(files -> files.forEach(file -> file.delete()));
		}else if("Linux".equals(System.getProperty("os.name"))){
			lessonDirectories
				.stream()
				.forEach(directoryName -> writeFileWithBytes(directoryName, "make"));

		}else{
			lessonDirectories
				.stream()
				.forEach(directoryName -> writeFileWithBytes(directoryName, "make.exe"));
		}
	}

	private static void writeFileWithBytes(final String directoryName, final String fileName){
		try{
			final String newFileName = directoryName.concat("/").concat(fileName);
			final File newFile = new File(newFileName);
			if(newFile.exists()){
				newFile.delete();
			}
			newFile.createNewFile();
			final OutputStream outputStream = new FileOutputStream(newFile);
			outputStream.write(getFileAsBytes(fileName));
			outputStream.close();
		}catch(final Exception exception){
			throw new RuntimeException(exception);
		}
	}

	private static byte[] getFileAsBytes(final String fileName) throws Exception{
		final InputStream inputStream = new FileInputStream(new File(fileName));
		final byte[] bytes = new byte[inputStream.available()];
		inputStream.read(bytes);
		inputStream.close();
		return bytes;
	} 
}
