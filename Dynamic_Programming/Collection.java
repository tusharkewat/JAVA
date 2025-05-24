package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList();
        // arr.add(100);
        // arr.add(0);
        // arr.add(12);
        // arr.add(5);
        // arr.add(1);
        // arr.add(145);
        // arr.add(2);
        // arr.add(20);
        // Collections.sort(arr);
        // System.out.println(arr);

        // ArrayList<String> str = new ArrayList();
        // str.add("e");
        // str.add("c");
        // str.add("a");
        // str.add("b");
        // str.add("T");
        // str.add("H");
        // str.add("D");
        // str.add("A");
        // str.add("B");
        // Collections.sort(str);
        // System.out.println(str);

        ArrayList<Integer> arr = new ArrayList();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);

        Collections.sort(arr);
        System.out.println(arr);
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
