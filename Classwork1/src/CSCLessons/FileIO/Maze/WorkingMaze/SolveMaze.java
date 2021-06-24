package CSCLessons.FileIO.Maze.WorkingMaze;

/**
 * Vishal Nigam
 * 3/1/18
 */
public class SolveMaze {
    Maze maze;
    int locX,locY;//Variables for current location
    public SolveMaze(){
        maze = new Maze();

        locX = maze.getStartX();
        locY = maze.getStartY();

        while(!maze.END(locX,locY)) {
            maze.printMaze();
            System.out.println("locX: "+locX+" locY: "+locY);
            maze.setDirection("North");
            if (maze.checkRight(locX, locY)) {
                maze.goEast();
                locX = maze.getRow();
                locY = maze.getColumn();
            }
            maze.setDirection("West");
            if (maze.checkRight(locX, locY)) {
                maze.goNorth();
                locX = maze.getRow();
                locY = maze.getColumn();
            }
            maze.setDirection("South");
            if (maze.checkRight(locX, locY)) {
                maze.goWest();
                locX = maze.getRow();
                locY = maze.getColumn();
            }
            maze.setDirection("East");
            if (maze.checkRight(locX, locY)) {
                maze.goSouth();
                locX = maze.getRow();
                locY = maze.getColumn();
            }
        }
        if(maze.END(locX,locY)){
            System.out.println("Maze Complete.");
        }
        else{
            System.out.println("Trapped!");
            System.exit(1);
        }




    }

    public static void main(String[]args){
        SolveMaze app = new SolveMaze();
    }
}
