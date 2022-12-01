import java.util.Scanner;
public class seed_number {
    public static void main(String[] args) {
        System.out.println("Enter a Main Number : ");
        Scanner sc = new Scanner(System.in);
        int mainNUmber = sc.nextInt();
        System.out.println("Enter a number to check its seed of main number or not : ");
        int seed_number = sc.nextInt();
        int result = 1;
        int temp = seed_number;
        for(int i = seed_number;i!=0;i=i/10){
            int rem = seed_number%10;
            result = result *rem;
           
            seed_number = seed_number/10;
        }
        int result2 = temp*result;
        if(result2 == mainNUmber){
            System.out.println("Number is seed number");
        }
        else{
            System.out.println("Entered Number"+temp + " is not a seed number of " + mainNUmber);
        }
       sc.close();
    }
}
