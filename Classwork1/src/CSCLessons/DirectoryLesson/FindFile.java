package CSCLessons.DirectoryLesson; /**
 * Vishal Nigam
 * 2/27/18
 */
import java.util.Arrays;
import java.util.Scanner;
public class FindFile {
    Directory[] dir;
    String name;
    String[] files;
    Scanner check = new Scanner(System.in);
    String fileName = check.next();

    public static void findFile(Directory direct, String fileName){

/*findFile(dir: Directory, fname: String): String
    for each file in dir
        if file's name equals fname
            return dir.name + '/' + fname
    for each subdirectory in dir
        path = findFile(subdirectory, fname)
        if path isn't null
            return dir.name + '/' + path
    return null (only reaches this if file wasn't found)*/
    }
    public FindFile(String n, Directory[] sd, String[] f)
    {
        name = n;
        dir = Arrays.copyOf(sd, sd.length);
        files = Arrays.copyOf(f, f.length);
    }
}
