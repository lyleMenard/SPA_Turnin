package src;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // i just used this class to test the structure population times
        int popNum = 10000000;
        TreeSet tree = new TreeSet();

        for(int i = 0; i < popNum; i++) {
            Random r = new Random();
            tree.add(r.nextInt(100000000));

        }
        //time calculation from https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
        long startTime = System.nanoTime();
        Boolean hasNum = tree.contains(50000);
        System.out.println(hasNum);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(duration);
    }
}
