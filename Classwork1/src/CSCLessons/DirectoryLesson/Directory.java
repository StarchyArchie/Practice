package CSCLessons.DirectoryLesson; /**
 * Zach Kohlberg
 *
 * Represents a directory (folder) in a file system
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Directory
{
    //Instance variables
    private String name;                    //Directory name
    private Directory[] subdirs;            //Subdirectories
    private String[] files;                 //File names

    //Constructor
    public Directory(String n, Directory[] sd, String[] f)
    {
        name = n;
        subdirs = Arrays.copyOf(sd, sd.length);
        files = Arrays.copyOf(f, f.length);
    }

    //Instance methods

    //Return the name of this directory
    public String getName()
    {
        return name;
    }

    //Return an array of subsubdirs
    public Directory[] getSubdirs()
    {
        return Arrays.copyOf(subdirs, subdirs.length);
    }

    //Return an array of file names
    public String[] getFiles()
    {
        return Arrays.copyOf(files, files.length);
    }

    //Static methods

    //Print a directory and its contents
    public static void printDir(Directory dir)
    {
        printDir(dir, "");
    }

    //Recursively print a directory and its contents
    private static void printDir(Directory dir, String prefix)
    {
        System.out.println(prefix + dir.getName());

        String newPrefix = prefix + "-";

        Directory[] subdirs = dir.getSubdirs();
        for (int i = 0; i < subdirs.length; i++)
        {
            printDir(subdirs[i], newPrefix);
        }
        String[] files = dir.getFiles();
        for (int i = 0; i < files.length; i++)
        {
            System.out.println(newPrefix + files[i]);
        }
    }

    //Create the file system described by the input file
    public static Directory createDirFromFile(File inputFile)
    {
        try
        {
            //Scanner to read input file
            Scanner fileReader = new Scanner(inputFile);

            //List of lines in the input file
            ArrayList<String> lines = new ArrayList<String>();
            
            //Add each line of the file to an array, excluding blank lines
            while (fileReader.hasNextLine())
            {
                String line = fileReader.nextLine().trim();
                if (line.length() > 0)
                {
                    lines.add(line);
                }
            }

            //Return the new directory
            Directory root = createDir(lines.toArray(new String[0]), "");
            return root;
        }
        catch (FileNotFoundException e)
        {
            //If no file is found, print an error message and return an empty directory with no name
            System.err.println("Could not find input file, returning null.\n");
            e.printStackTrace();
            return new Directory("", new Directory[0], new String[0]);
        }
    }

    //Recursively construct a directory from an array of strings representing subsubdirs and files
    public static Directory createDir(String[] lines, String prefix)
    {
        //Data for this directory
        String name = lines[0].substring(prefix.length());
        ArrayList<Directory> subdirs = new ArrayList<Directory>();
        ArrayList<String> files = new ArrayList<String>();

        /* 
         * In the input file, the directory's structure is determined by how many dashes a name has before it.
         * If a name has one more dash than the preceding name, then the preceding name is a directory and all
         * "indented" names are files and subsubdirs belonging to that directory.
         *
         * newPrefix contains the number of dashes used for a file or subdirectory of the current directory
         * childPrefix contains the number of dashes used for a child of the current directory's subdirectory
         *
         * This method assumes that the input file has a legal structure and does not check for errors
         */
        String newPrefix = prefix + "-", childPrefix = newPrefix + "-";
        
        int start = 1, end = 1;
        while (end < lines.length)
        {
            start = end;
            end++;

            //Increment end until it is the upper [exclusive] bound of the range of lines representing the next
            //subdirectory. If this is a file and not a subdirectory, then this loop will be skipped
            while (end < lines.length && lines[end].startsWith(childPrefix))
            {
                end++;
            }

            //Only one line is in the range, so this is a file
            if (end == start + 1)
            {
                files.add(lines[start].substring(newPrefix.length()));
            }
            else //Multiple lines are in the range, so this is a directory
            {
                String[] newLines = Arrays.copyOfRange(lines, start, end);
                subdirs.add(createDir(newLines, newPrefix));
            }
        }

        return new Directory(name, subdirs.toArray(new Directory[0]), files.toArray(new String[0]));
    }
    public static boolean pathExists(Directory dir, String path){
        String name = path.substring(0, path.indexOf('/')), pathEnd = path.substring(path.indexOf('/')+1);
        if (name.equals(dir.getName())){
            String[] files = dir.getFiles();
            for(int i = 0; i<files.length; i++){
                if(files[i].equals(pathEnd)) return true;
            }
            Directory[] subdirs = dir.getSubdirs();
            for(int i = 0; i<subdirs.length; i++){
                if(pathExists(subdirs[i],pathEnd)) return true;
            }
            return false;
        }
        else return false;
    }
}

