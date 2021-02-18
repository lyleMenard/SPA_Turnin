package src;

import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> sorting = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            sorting.add(random.nextInt(20));
        }
        System.out.println(sorting.toString());
        System.out.println(SelectSort.selectSort(sorting));
    }
}
