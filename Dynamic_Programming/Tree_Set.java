package Dynamic_Programming;

import java.util.TreeSet;

// ye unique value ko store bhi karta he or values ko sort bhi karta hai.

public class Tree_Set {
    public static void main(String[] args) {
        int[] arr = {100,30,90,100,90,20,50,80,10,0};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
