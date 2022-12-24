import java.util.Scanner;

public class StringInput{
    public static void main(String[] args) {
        System.out.println("Enter a string --- ");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);
        sc.close();
    }
}