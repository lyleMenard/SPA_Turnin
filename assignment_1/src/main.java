package src;

public class main {
    public static void main(String[] args) {
        mouse mouse = new mouse("Charles E. Cheese", 4, 2);
        mouse.moveUp();
        mouse.moveUp();
        mouse.moveLeft();
        mouse.moveDown();
        mouse.moveRight();
        mouse.printInformation();
    }
}
