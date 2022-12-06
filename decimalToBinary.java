import java.util.Scanner;
public class decimalToBinary {
       public static void main(String[] args) {
        int binary =0;
        System.out.println("Enter a number to print Binary Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k =1;
        for(int i = number;i!=0;i=i/2){
            int rem = i%2;
            binary = binary +rem*k;
            k= k*10;
        }
        System.out.println("The binary number of "+number+" is " +binary);
        sc.close();
       }
}
