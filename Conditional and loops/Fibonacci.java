import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num  = sc.nextInt();

        int a =0;
        int b= 1;
        int c = 0;

        for(int i =2; i<=num;i++){
            c = a +b;
            a =b;
            b =c;
        }
        System.out.println(c);
        sc.close();
    }
}
