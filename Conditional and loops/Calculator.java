import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an operation - ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print(" Enter 1st number -");
                int num1 = sc.nextInt();
                System.out.print(" Enter 2nd number -");
                int num2 = sc.nextInt();
                int result = 0;
                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (op == '%') {
                    result = num1 % num2;
                }
                System.out.println("result  = " + result);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        sc.close();

    }
}
