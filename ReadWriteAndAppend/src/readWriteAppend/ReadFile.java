package readWriteAppend;

import java.io.FileReader;

public class ReadFile {
	public static void main(String args[]) throws Exception {
		FileReader filereadObj = new FileReader("/Users/kashy/Desktop/NewFile.txt");
		int iterator;
		while ((iterator = filereadObj.read()) != -1)
			System.out.print((char) iterator);
		filereadObj.close();
	}
}