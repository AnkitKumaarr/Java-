import java.util.Scanner;
public class luckyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its lucky number or not");
        Scanner sc = new Scanner(System.in);
        int baseNumber = sc.nextInt();
        int sum = 0;
        for(int i = baseNumber;i!=0;i=i/100){
            int divideNUmber = baseNumber/10;
            int rem = divideNUmber%10;
            sum = sum+(rem*rem);
            System.out.println(rem);
            System.out.println(sum);
            baseNumber = baseNumber/100;

        }
        
        if(sum/9==0){
            System.out.println("Entered number is Lucky!!!!!!......");
        }
        else{
            System.out.println("Entered number is not lucky number");
        }
        sc.close();
    }
}
