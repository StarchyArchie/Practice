package CSCLessons.FileIO.Maze; /**
 * Vishal Nigam
 * 2/13/18
 * Overrides a text file with new text.
 */
import java.io.*;

public class FileOutput {
    public static void main(String[] args){

        PrintWriter output;
        FileWriter outfile;

        System.out.println("Opening and writing file");

        try{
            outfile = new FileWriter("Classwork1/SimpleMaze.txt");
            output = new PrintWriter(outfile);

            for( int i = 1; i <= 10; i++){
                output.println("line " + i);
            } // end for

            output.close();

        } // end try

        catch (IOException e){
            System.out.println(e);
            System.exit(1);		// IO error; exit program
        } // end catch

        System.out.println("end of program");
    }

}
