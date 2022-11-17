import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("number is Even");

        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
