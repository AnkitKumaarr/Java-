import java.util.Scanner;

public class Largest_using_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(c,Math.max(a, b));
        System.out.println("The largest number is " + max);
        sc.close();
    }
}
