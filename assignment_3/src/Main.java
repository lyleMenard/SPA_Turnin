package src;

public class Main {
    public static void main(String[] args) {
        //create and print grid
        Grid grid = new Grid(4, 4, 3);
        System.out.println(grid);

        Mouse mouse = new Mouse(grid, "mousey" , 0, 0);


        //print da mouse
        System.out.println(mouse);
        System.out.println(grid);

        boolean foundEmpty = true;
        while(foundEmpty) {
            int[] mouseView = mouse.scanSurroundings(grid);
            foundEmpty = false;
            if (mouseView[0] != 9) {  //if not out of bounds or already taken
                mouse.move(mouseView[0], mouseView[1], grid); //move according to the first movement vector
                foundEmpty = false;
            }
            for (int i = 0; i < mouse.coordinateHistoryStack.size(); i++) {
                grid.changeSpot(mouse.coordinateHistoryStack.get(i)[0], mouse.coordinateHistoryStack.get(i)[1], mouse);
                int[] mouseViewAgain = mouse.scanSurroundings(grid);
                if (mouseView[0] != 9) {  //if not out of bounds or already taken
                    mouse.move(mouseView[0], mouseView[1], grid); //move according to the first movement vector
                }
                foundEmpty = false;
            }
        }


        mouse.moveRight(grid);
        System.out.println(grid);
    }
}
