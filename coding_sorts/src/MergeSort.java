package src;

import java.util.ArrayList;

public class MergeSort {
    public static int minValue2(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        int minVal = -1;
        l1.addAll(l2);
        int index = 0;

        for(int i = 0; i < l1.size(); i++) {
            if ((minVal == -1)||(i < minVal)) {
                minVal = l1.get(i);
                index = i;
            }
        }

        return index;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        //return one list that is sorted
        l1.addAll(l2);
        return SelectSort.selectSort(l1);
    }
}
