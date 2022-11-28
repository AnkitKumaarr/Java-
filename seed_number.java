import java.util.Scanner;

public class seed_number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        System.out.println(temp);
        
        sc.close();
    }
}
