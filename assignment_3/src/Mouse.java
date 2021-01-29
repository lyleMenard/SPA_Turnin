package src;

import java.util.ArrayList;

public class Mouse {
    public String name;
    public Integer xCoordinate;
    public Integer yCoordinate;
    public ArrayList<Integer[]> coordinateHistoryStack;

    public Mouse(Grid grid, String name, int x, int y) {
        this.name = name;
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.coordinateHistoryStack = new ArrayList<Integer[]>();
        Integer[] coords = {x, y};
        this.coordinateHistoryStack.add(coords);
        grid.changeSpot(x,y,this);
    }

    public String toString(){
        String mouseString = this.name + ", (" + this.xCoordinate + ", " + this.yCoordinate + ")";
        return mouseString;
    }

    public String getMouseName() {
        return this.name;
    }

    public Integer getxCoordinate() {
        return this.xCoordinate;
    }

    public Integer getyCoordinate() {
        return this.yCoordinate;
    }

    public void setxCoordinate(int x) {
        this.xCoordinate = x;
    }

    public void setyCoordinate(int y) {
        this.yCoordinate = y;
    }

    public void printInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Coordinates: ("+ this.xCoordinate + "," + this.yCoordinate + ")");
        System.out.print("History Stack: [");
        for(Integer[] coord:coordinateHistoryStack) {
            System.out.print("(" + coord[0] + "," + coord[1] + "),");
        }
        System.out.println("\b]");
    }

    public int[] scanSurroundings(Grid grid) {
        int[][] surroundings = new int[grid.xDimension][grid.yDimension];
        int[] returnVector = new int[2];
        int x = 0;
        int y = 0;
        for (int i = this.xCoordinate - 1; i < this.xCoordinate + 1; i++) {
            for (int j = this.yCoordinate + 1; j < this.yCoordinate + 1; j++) {
                if (((i + x >= 0) && (i - x < grid.xDimension)) &&
                        ((j + y >= 0) && (j + y < grid.yDimension))) {
                    if (grid.grid.get(x).get(y) == 0) {
                        return returnVector = new int[]{i, j};
                    }
                    y++;
                }
                x++;
            }
        } //9 means out of bounds or no value
        return returnVector = new int[]{9, 9};
    }

    public boolean inBounds(int x, int y, Grid grid) {
        boolean isIn;
        if((this.xCoordinate-x >= 0) && (this.xCoordinate-x < grid.xDimension)&&(this.yCoordinate+y >= 0) && (yCoordinate+y < grid.yDimension)){
            isIn = true;
        } else {
            isIn = false;
        }
        return isIn;
    }
    public void move(int movex, int movey, Grid grid) {
        Integer[] coords = {this.xCoordinate, this.yCoordinate};
        grid.grid.get(this.xCoordinate).set(this.yCoordinate,2);
        this.coordinateHistoryStack.add(coords);
        if (this.inBounds(this.xCoordinate + movex, this.yCoordinate + movey, grid)) {
            if (grid.grid.get(this.xCoordinate + movex).get(this.yCoordinate + movey) != 1) {
                this.xCoordinate += movex;
                this.yCoordinate += movey;
            }
        }
        grid.grid.get(this.xCoordinate).set(this.yCoordinate,3); //i am using 3 to represent the current position of the mouse
    }

    public void moveUp(Grid grid) {
        this.move(0, 1, grid);
    }

    public void moveDown(Grid grid) {
        this.move(0, -1, grid);
    }

    public void moveRight(Grid grid) {
        this.move(1, 0, grid);
    }

    public void moveUpRight(Grid grid) {
        this.move(1, 1, grid);
    }

    public void moveDownRight(Grid grid) {
        this.move(1, -1, grid);
    }

    public void moveLeft(Grid grid) {
        this.move(-1, 0, grid);
    }

    public void moveUpLeft(Grid grid) {
        this.move(-1, 1, grid);
    }

    public void moveDownLeft(Grid grid) {
        this.move(-1, -1, grid);
    }

}
