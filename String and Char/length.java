import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        System.out.println("Enter a string --");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.length());
        sc.close();
    }
}
