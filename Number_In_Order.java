import java.util.Scanner;

public class Number_In_Order {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNumber = 0; 
        
        for(int i = num;i!=0;i=i/10){
            int rem = num%10;
            reverseNumber = reverseNumber*10 +rem;            
            num = num/10;
        }
        for(int i = reverseNumber; i!=0;i = i/10){
            int rem = reverseNumber%10;
            System.out.println(rem);
            reverseNumber = reverseNumber/10;
        }
        sc.close();
    }
}
