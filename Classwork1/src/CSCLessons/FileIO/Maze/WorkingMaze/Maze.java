package CSCLessons.FileIO.Maze.WorkingMaze; /**
 * Vishal Nigam
 * 3/1/18
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Maze {

    int row,column,exitX,exitY,startX,startY,dimX,dimY;
    char maze[][];
    String input, direction;
    Scanner scan;
    public void goNorth(){
        if(!END(row,column)){
        if(maze[row][column]=='P'){
            maze[row][column]='V';
        }
        else {maze[row][column]='P';}
        column--;
        }
    }
    public void goSouth(){
        if(!END(row,column)) {
            if (maze[row][column] == 'P') {
                maze[row][column] = 'V';
            } else {
                maze[row][column] = 'P';
            }
            column++;
        }
    }
    public void goEast(){
        if(!END(row,column)) {
            if (maze[row][column] == 'P') {
                maze[row][column] = 'V';
            } else {
                maze[row][column] = 'P';
            }
            row++;
        }
    }
    public void goWest(){
        if(!END(row,column)) {
            if (maze[row][column] == 'P') {
                maze[row][column] = 'V';
            } else {
                maze[row][column] = 'P';
            }
            row--;
        }
    }
    public Maze(){
        try {
            File mazetxt = new File("Classwork1/SimpleMaze.txt");
            int x, y, j;//dimensions and incrementing variable
            scan = new Scanner(mazetxt);
            direction = "North";//sets Direction faced to North
            x = scan.nextInt();//sets x and y dimensions of maze array
            y = scan.nextInt();
            maze = new char[x][y];
            System.out.println("X: "+x+" Y: "+y);
            exitX = scan.nextInt();//Sets x and y coordinates of exit
            exitY = scan.nextInt();
            startX = scan.nextInt();//Sets x and y coordinates of entrance
            startY = scan.nextInt();
            dimX = x;
            dimY = y;
            row = startX;
            column = startY;
            scan.nextLine();//removes tab
            j = 0;
            while (scan.hasNextLine()) {//scans the maze and places it into the array maze[][]
                input = scan.nextLine();
                for (int i = 0; i < input.length(); i++) {
                    maze[i][j] = input.charAt(i);
                }
                j++;

            }

        }
        catch (FileNotFoundException e){
            System.out.println(e);
            System.exit(1);
        }
        maze[exitX][exitY] = 'O';
        maze[startX][startY] = 'E';
    }
    public void printMaze(){

        for(int colCount=0; colCount<maze[0].length; colCount++) {
            System.out.print(colCount+": ");
            for (int i = 0; i < maze.length; i++) {
                System.out.print(maze[i][colCount]);
            }
            System.out.println("");
        }
    }
    public String getDirection(){
        return direction;
    }
    public boolean checkRight(int x,int y){
        System.out.println("Direction: "+direction+" X: "+x+" Y: "+y);
        if(direction.equals("North")&& x<dimX-1){
                return (maze[x + 1][y] == ' ' || maze[x + 1][y] == 'P' || maze[x + 1][y] == 'O');
        }
        if(direction.equals("South")&& x>0){
            return (maze[x-1][y]==' '||maze[x-1][y]=='P'||maze[x-1][y]=='O');
        }
        if(direction.equals("East")&& y<dimY-1){
            return (maze[x][y+1]==' '||maze[x][y+1]=='P'||maze[x][y+1]=='O');
        }
        if(direction.equals("West")&& y>0) {
            return (maze[x][y-1] == ' ' || maze[x][y-1] == 'P'||maze[x][y-1]=='O');
        }
        else return false;
    }
    public boolean END(int x,int y){
        return maze[x][y]=='O';
    }
    public int getStartX(){
        return startX;
    }
    public int getStartY(){
        return startY;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public void setDirection(String dir){
        direction = dir;
    }
}
