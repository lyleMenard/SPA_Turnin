package src;

import java.util.ArrayList;

public class SelectSort {
    public static int minValue(ArrayList<Integer> list) {
        // find min value of list and returns it
        int minValue = -1;
        int minValIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if ((minValue == -1) || (minValue > list.get(i))) {
                minValue = list.get(i);
                minValIndex = i;
            }
        }
        return minValIndex;
    }

    public static ArrayList selectSort(ArrayList<Integer> list) {
        // sort list from L>=0
        int originalSize = list.size();
        ArrayList<Integer> sortedArray = new ArrayList<>();

        for(int i = 0; i < originalSize; i++) {
            sortedArray.add(list.get(minValue(list)));
            list.remove(minValue(list));
        }
        return sortedArray;
    }
}
