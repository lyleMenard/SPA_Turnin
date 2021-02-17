package src;
import java.util.*;

public class MyHashSet {
    private ArrayList<LinkedList<Integer>> myHash;
    private int bucketSize = 10;

    public void add(int k) {
        if(this.myHash.size() * bucketSize >= k) {
            if(!search(k)) {
                this.myHash.get((k-1)/bucketSize).add(k);
            }
        }
    }

    public boolean search(int k) {
        boolean inset = false;
        if(this.myHash.size() >= (k/bucketSize)) {
            while(this.myHash.get(k/bucketSize) != null) {
                if(this.myHash.get(k/bucketSize).get(0) == k) {
                    inset = true;
                }
            }
        } else {
            hashing(k);
            this.myHash.get(k/bucketSize).add(k);
        }
        return inset;
    }

    private void hashing(int k) {
        int bucketNum = ((k-myHash.size() * bucketSize)/bucketSize + 1);
        for(int i = 0; i < bucketNum; i++) {
            myHash.add(new LinkedList<Integer>());
        }
    }
}