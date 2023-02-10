import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check it is even or odd -- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = num & 1;
        if(rem == 1){
            System.out.println("Number is odd");

        }
        else{
            System.out.println("NUmber is Even ");
        }
        sc.close();
    }
}
