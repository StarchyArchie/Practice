package CSCLessons.FileIO;/*
* Vishal Nigam
* Reads a text file and returns the number of times a word is found within.
*/
import java.util.Scanner;
import java.io.*;

public class WordCount {
	
	public static void main(String[] args){
		
		String inputLine;
		Scanner fileInput;
        String word;
        String name;
        Scanner check;
        System.out.println("Enter your file's name:");
        check = new Scanner(System.in);
        name = check.next();
        System.out.println("Enter a word to count:");
        word = check.next();

        File inFile = new File(name);
		//File inFile = new File("Classwork1/buffalo.txt");
		
		//System.out.println("Opening and reading file");
		
		try{
			fileInput = new Scanner(inFile);
            int i = 0;
			while(fileInput.hasNext()){
				inputLine = fileInput.next();
				if(inputLine.equalsIgnoreCase(word)){
                    i++;
                }
			} // end while
            System.out.println("The word \""+word+"\" appears "+i+" times in "+name+".");
			fileInput.close();
			
		} // end try
		
		catch (FileNotFoundException e){
            System.out.println("ERROR: "+name+" not found.");
			System.exit(0);		// IO error; exit program
		} // end catch
	}
}

