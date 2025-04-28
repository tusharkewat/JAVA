package Number_Programming_Question;

import java.util.Scanner;

public class Sum_of_NaturalNum {
    static void NaturalNum(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.print("Sum of Natural number is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        NaturalNum(num);
    }
}
