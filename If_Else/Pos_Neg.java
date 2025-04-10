package If_Else;

import java.util.Scanner;

public class Pos_Neg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Number is Negativ.");
        } else if (a > 0) {
            System.out.println("Number is Positiv.");
        } else
            System.out.println("Number is Zero.");
    }
}
