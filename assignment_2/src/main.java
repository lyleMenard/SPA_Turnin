package src;

import java.util.*;

public class main {
    public static void main(String[] args) {
        //run code for part 1:
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
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        MyStack myMyStack = new MyStack(myArrayList);
    }
}
