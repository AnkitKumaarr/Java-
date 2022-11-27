import java.util.Scanner;
public class Divide_by_sum_of_digit{
    public static void main(String[] args) {
        int count=0,sum=0;
        System.out.println("Enter a number to find sum of its digit is dividing the number or not");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        for(int j = num; j!=0;j=j/10){
            count++;
        }
        System.out.println(count);
        for(int i = num;i!=0;i=i/10){
            int a =  num%10;
            // System.out.println("a = "+a);
            sum = sum +a;
            // System.out.println("sum = " +sum);
            // num = num/10;
            // System.out.println("num " +num);
        }
        
        if(num%sum==0){
            System.out.println("The sum of its digit is "+sum);
            System.out.println(num+ " is divisible by sum of its digit");
        }
        else{
            System.out.println("The number is not divisble by its digit");
        }
        sc.close();
    }
}