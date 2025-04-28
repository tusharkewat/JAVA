package Number_Programming_Question;

import java.util.Scanner;

public class Even_Num_Between_2Num {
    static void Even(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.err.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        Even(num1, num2);
    }
}
