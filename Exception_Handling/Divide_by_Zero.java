package Exception_Handling;

import java.util.Scanner;

public class Divide_by_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We can not divide by zero");
        }
        System.out.println("End of program");
        sc.close();
    }
}
