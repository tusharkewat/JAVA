package Dynamic_Programming;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        int[] arr = {1,9,10,11,2,9,1,3,3,4,4,5,5,5,6,6,7,7};
        HashSet<Integer> set = new HashSet<>();
        // int count=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                // count++;
                break;
            }
            else {
                set.add(arr[i]);
            }
        }
        System.out.println(set);

        
    }
}
