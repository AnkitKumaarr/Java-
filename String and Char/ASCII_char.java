import java.util.Scanner;

public class ASCII_char {
    public static void main(String[] args) {
        System.out.println("Enter a char ");
        Scanner sc = new Scanner(System.in);
        int input = sc.next().charAt(0); 
        System.out.println(input);
        sc.close();
    }
}
