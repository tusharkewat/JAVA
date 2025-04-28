package Number_Programming_Question;

import java.util.Scanner;

public class Natural_Number {
    static void NaturalNum(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        NaturalNum(num);
    }
}
