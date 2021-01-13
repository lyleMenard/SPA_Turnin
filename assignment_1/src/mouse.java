package src;

import java.util.ArrayList;

public class mouse {
    public String name;
    public Integer xCoordinate;
    public Integer yCoordinate;
    public ArrayList<Integer[]> coordinateHistoryStack;
    public mouse(String name, int x, int y) {
        this.name = name;
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.coordinateHistoryStack = new ArrayList<Integer[]>();
        Integer[] coords = {x, y};
        this.coordinateHistoryStack.add(coords);
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

    public void printInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Coordinates: ("+ this.xCoordinate + "," + this.yCoordinate + ")");
        System.out.print("History Stack: [");
        for(Integer[] coord:coordinateHistoryStack) {
            System.out.print("(" + coord[0] + "," + coord[1] + "),");
        }
        System.out.println("\b]");
    }

    public void moveUp() {
        Integer[] coords = {this.xCoordinate, this.yCoordinate}; //idk why i have to instantiate this here but whatever
        this.coordinateHistoryStack.add(coords);
        this.yCoordinate += 1;
    }

    public void moveDown() {
        Integer[] coords = {this.xCoordinate, this.yCoordinate};
        this.coordinateHistoryStack.add(coords);
        this.yCoordinate -= 1;
    }

    public void moveRight() {
        Integer[] coords = {this.xCoordinate, this.yCoordinate};
        this.coordinateHistoryStack.add(coords);
        this.xCoordinate += 1;
    }

    public void moveLeft() {
        Integer[] coords = {this.xCoordinate, this.yCoordinate};
        this.coordinateHistoryStack.add(coords);
        this.xCoordinate -= 1;
    }
}
