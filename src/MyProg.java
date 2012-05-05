import simbad.gui.Simbad;
public class MyProg {
    public static void main(String[] args) {
              boolean mazeRows[][] = {
            { false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false, false },
            { false, true, true, false, true, true, false },
            { true, true, false, false, true, false, true, false },
            { false, false, true, true, false, false, false },
            { false, true, true, false, false, true, true, false },
            { false, false, false, false, true, false, false },
            { false, true, false, true, true, false, true, false },
            { false, true, true, false, false, false, false },
            { false, true, true, false, true, true, true, false },
            { false, false, false, true, true, false, false },
            { false, true, false, false, false, false, true, false },
            { false, true, true, false, true, true, false },
            { false, false, false, false, false, false, false, false },
            { false, false, false, false, false, false, false } };

              Maze maze = new Maze(mazeRows);
              boolean rows[][] = maze.getRows();
              System.out.println(rows.length);
              Simbad frame = new Simbad(new MazeEnvironmentDescription(maze), false);
             // Simbad frame = new Simbad(new EnvironmentDescription(), false);
    }
}
