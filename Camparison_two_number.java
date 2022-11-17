import java.util.Scanner;
public class Camparison_two_number {
   public static void main(String[] args) {
    // which number is greater 
    System.out.println("Enter 1st Number");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd Number");
    int num2 = sc.nextInt();

    if (num1 > num2){
        System.out.println("Number 1 is grearter");
    }
    else{
        System.out.println("Number 2 is greater");
    }
    sc.close();
   } 
}
