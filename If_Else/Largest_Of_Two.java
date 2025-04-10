package If_Else;

import java.util.Scanner;

public class Largest_Of_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number a : ");
        int a = scanner.nextInt();
        System.out.print("Enter Second number b : ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("a is Greater");
        }
        else
            System.out.println("b is Greater");
    }
}
