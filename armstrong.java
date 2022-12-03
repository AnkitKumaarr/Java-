import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("Enter a number to check find out its Armstrong number or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        for(int i = num; i!=0;i = i/10){
            int rem = num%10;
            sum = sum + rem * rem * rem;
            num = num/10;
        }
        
        if(temp == sum){
            System.out.println("Entered number is Armstrong number");
        }
        else{
            System.out.println("Entered number is not Armstrong number ");
        }
        sc.close();
    }
}
