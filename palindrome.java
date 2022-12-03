import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("Enter a number to check its palindrome or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        for(int i = num; i!=0;i =i/10){
            int rem = num%10;
            sum = sum*10 +rem;
            num= num/10;    
        }
        if(temp==sum){
            System.out.println("Entered number is palindrome");
        }
        else{
            System.out.println("Entered number is not palindrome");
        }
        sc.close();
    }
}
