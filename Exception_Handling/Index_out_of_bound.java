package Exception_Handling;

public class Index_out_of_bound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
