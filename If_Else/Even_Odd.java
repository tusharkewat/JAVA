package If_Else;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();
        if (a != 0) {
            if (a % 2 == 0) {
                System.out.println("Number is Even.");
            } else
                System.out.println("Number is Odd.");
        } else {
            System.out.println("Number is Zero.");
        }
    }
}
