import java.util.Scanner;

public class InputChar {
    public static void main(String[] args) {
        System.out.println("Enter a char ---");
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);
        sc.close();
    }
}
