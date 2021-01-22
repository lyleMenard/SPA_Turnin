package src;

public class main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        MyList myMyList = new MyList(myArray);
        myMyList.printList();
        myMyList.append(10);
        myMyList.printList();
        myMyList.pop();
        myMyList.printList();
        myMyList.insert(4,6);
        myMyList.printList();
        myMyList.remove(6);
        myMyList.printList();
    }
}
