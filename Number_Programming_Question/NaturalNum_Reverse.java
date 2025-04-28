package Number_Programming_Question;

import java.util.Scanner;

public class NaturalNum_Reverse {
    static void ReverseNum(int a){
        for (int i = a; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        ReverseNum(num);
    }
}
