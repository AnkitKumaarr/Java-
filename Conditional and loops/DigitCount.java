import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number --- ");
        int number = sc.nextInt();
        System.out.print("Enter a number to find that occurance in "+ number + " --");
        int n = sc.nextInt();
        int count = 0;        
        while (number != 0) {
            if (number % 10 == n) {
                count++;
            }
            number = number / 10;            
        }
        System.out.println(count);
        sc.close();
    }
    

}
