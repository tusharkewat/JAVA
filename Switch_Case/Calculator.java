package Switch_Case;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Enter first number a : ");
          int a = scanner.nextInt();
          System.out.print("Enter second number b : ");
          int b = scanner.nextInt();
          System.out.print("Enter operation : ");
          char ope = scanner.next().charAt(0);
          switch (ope) {
          case '+':
          System.out.println("a + b = : " + (a + b));
          break;
          case '-':
          System.out.println("a - b = : " + (a - b));
          break;
          case '*':
          System.out.println("a * b = : " + (a * b));
          break;
          case '/':
          System.out.println("a / b = : " + (a / b));
          break;
          default:
          System.out.println("Invalid operation");
          break;
          }
    }
}
