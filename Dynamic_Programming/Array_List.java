package Dynamic_Programming;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Tushar");
        arr.add("Virat");
        arr.add(1, "Kewat");
        arr.add(3, "Kohli");
        // System.out.println(arr);
        for (String str : arr) {
            System.out.print(str + " ");
        }
        arr.set(2, "Rohit");
        arr.set(3, "Sharma");
        // System.out.println(arr);
        // arr.clear();
        // arr.remove(2);
        System.out.println();
        for (String str : arr) {
            System.out.print(str + " ");
        }

    }
}
