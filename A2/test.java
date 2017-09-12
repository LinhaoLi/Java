import java.util.*;
import java.io.*;

public class test{
	public static void main(String[] args){

		try{
			File random = new File("randomChars.txt");
			PrintWriter pw = new PrintWriter(random);
			for(int i = 0 ; i < 15 ; i++){
				pw.println((char)(Math.random()*('z'-'a')+'a'));
			}
			pw.close();
			IOException sos = new IOException("Hello Houston!");
			throw sos;

		}
		//why do we have this?
		catch(FileNotFoundException e){
			//System.out.println("File not found.");
			System.err.println(e);
			e.printStackTrace();
		}
		catch(IOException e){
			System.err.println(e);
		}


	}
}
