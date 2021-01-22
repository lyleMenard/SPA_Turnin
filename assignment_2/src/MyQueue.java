package src;

import java.util.*;

public class MyQueue {
    ArrayList<Integer> myQueue;

    public void queue(Integer k) {
        this.myQueue.add(k);
    }

    public int dequeue() {
        int x = this.myQueue.get(0);
        this.myQueue.remove(0);
        return x;
    }
}
