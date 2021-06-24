package CSCLessons.DirectoryLesson; /**
 * Zach Kohlberg
 *
 * Demonstrates how to use the directory class
 */

import java.io.File;

public class TestDirectory
{
    public static void main(String[] args)
    {
        /* Creating a directory requires a text file
         * Provide the name of the file to the static createDirFromFile method
         * This defaults to using the c.dir file, but you can create your own directory file for testing if you wish
         */
        Directory rootFolder = Directory.createDirFromFile(new File("Direct/c.dir"));

        //Print the entire directory structure
        System.out.println("DIRECTORY STRUCTURE:");
        Directory.printDir(rootFolder);

        /* The code below assumes rootDirectory contains several nested subdirectories,
         * and that a particular subdirectory contains a file. This part of the program may
         * crash when run with other directory files. Its only purpose is to demonstrate
         * one way to print a file nested within several directories
         */

        //Get the first subdirectory of rootFolder
        Directory subfolder = rootFolder.getSubdirs()[0];

        //Print the contents of the first subdirectory of rootFolder
        System.out.println("SUBFOLDER: ");
        Directory.printDir(subfolder);

        //Print the path of the above subdirectory
        System.out.println(rootFolder.getName() + "/" + subfolder.getName());

        //Get a subfolder of subfolder and one of its files
        Directory subfolderChild = subfolder.getSubdirs()[2];
        String file = subfolderChild.getFiles()[0];

        //Print the path of a file
        System.out.println(rootFolder.getName() + "/" + subfolder.getName() + "/" + subfolderChild.getName() + "/" + file);

        //Uncomment the code below to test your FindFile method

        //System.out.println("Finding file \"Stanley.exe\": \n\t" + FindFile.findFile(rootFolder, "Stanley.exe"));
    }
}
