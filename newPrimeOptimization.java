import java.util.Scanner;

public class newPrimeOptimization {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        boolean prime = true;

        if(num%2==0 || num %3 ==0){
            prime = false;
        }
        
        for(int i = 5;i<=5;i+=6){
            count++;
            if(num%i==0 || num % (i%2) ==0){
                prime = false;
                break;
            }

        }
        
        System.out.println("Iteration  = "+count);
        if(prime){
            System.out.println("Not a prime Number");
        }
        else{
            System.out.println("A prime number");
        }
        sc.close();
    }
}
