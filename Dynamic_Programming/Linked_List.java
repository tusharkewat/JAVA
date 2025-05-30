package Dynamic_Programming;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        // // System.out.println(arr.contains(5));
        // arr.removeLast();
        // System.out.println(arr);
        for (int i = 0; i < 1000; i++) {
            if (i >= 100 && i <= 200) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}