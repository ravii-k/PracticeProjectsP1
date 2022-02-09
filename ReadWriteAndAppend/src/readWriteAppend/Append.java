package readWriteAppend;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Append {
	public static void main(String args[]) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("/Users/kashy/Desktop/NewFile.txt", true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
		
			pw.println("I am Good");
            pw.println("He is Good");
            pw.println("You are Good");

            System.out.println("Data Successfully appended into file");
            pw.flush();
		
		} finally { 
			try {
				pw.close();
				bw.close();
				fw.close();
			 } catch (IOException io) {
			 }
		}
            
		try (FileWriter f = new FileWriter("/Users/kashy/Desktop/NewFile.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);)
				{
					p.println("appending text into file");
			 p.println("How are you");
			 p.println("I am fine");
			 }
	catch (IOException i) {
		i.printStackTrace();
		} 
		}
	}


		
