package CSCLessons.FileIO.Maze; /**
 * Vishal Nigam
 * 2/13/18
 */
    import java.util.Scanner;
    import java.io.*;

    public class FileInput{

        public static void main(String[] args){

            String inputLine;
            char maze[][] = new char[20][20];

            Scanner fileInput;
            File inFile = new File("Classwork1/SimpleMaze.txt");

            System.out.println("Opening and reading file");

            try{
                fileInput = new Scanner(inFile);

                while(fileInput.hasNext()){
                    inputLine = fileInput.next();
                    int j = 0;
                    for(int i=0;i<inputLine.length();i++){
                        maze[i][j]= inputLine.charAt(i);
                    }

                    System.out.println(inputLine);
                    j++;
                } // end while

                fileInput.close();

            } // end try

            catch (FileNotFoundException e){
                System.out.println(e);
                System.exit(1);		// IO error; exit program
            } // end catch

            System.out.println("end of program");
        }
    }