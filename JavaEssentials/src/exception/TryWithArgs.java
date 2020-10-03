package exception;
import java.io.*;
public class TryWithArgs {
	private static void printFile() throws IOException {

	    try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	public static void main(String args[]) {
		System.out.println(System.getProperty("user.dir"));
		try {			
		TryWithArgs.printFile();
		}
		
		catch(IOException e) {
			System.out.println("Couldn't find the file");
		}
	}
}

/*Homework*/