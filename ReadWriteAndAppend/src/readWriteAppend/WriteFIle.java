package readWriteAppend;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFIle {
	public static void main(String[] args) throws IOException {
		try {
			FileWriter fw = new FileWriter("/Users/kashy/Desktop/NewFile.txt");
			fw.write("Welcome to this new file,Hello! I am Ravi Kashyap");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("File Created Sucessfully");
	}
}