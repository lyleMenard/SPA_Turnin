package src;
import java.util.*;

public class Grid {

    ArrayList<ArrayList<Integer>> grid;
    int xDimension;
    int yDimension;
    int numberOfWalls;

    public Grid(int xDimension, int yDimension, int numberOfWalls) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.numberOfWalls = numberOfWalls;
        this.grid = populateGrid();

    }


    private ArrayList<ArrayList<Integer>> populateGrid() {
        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < this.yDimension; i++) {
            ArrayList<Integer> zeros = new ArrayList<Integer>(Collections.nCopies(this.xDimension, 0));

            Random rand = new Random();

            int change = rand.nextInt(zeros.size());
            zeros.set(change, 1);

            g.add(zeros);


        }
        return g;
    }

    public String toString() {
        String stringGrid = "";
        for (int i = 0; i < xDimension; i++) {
            for(int j = 0; j < yDimension; j++) {
                stringGrid += "(" + this.getCoordValue(i,j) + "), ";
            }
            stringGrid += "\n";
        }
        return stringGrid;
    }

    public Integer getCoordValue(int xIndex, int yIndex) {
        return this.grid.get(xIndex).get(yIndex);
    }

    public void changeSpot(int x, int y, Mouse mouse) {
        this.grid.get(mouse.xCoordinate).set(mouse.yCoordinate, 2);
        mouse.setxCoordinate(x);
        mouse.setyCoordinate(y);
        this.grid.get(x).set(y, 3);
    }
}