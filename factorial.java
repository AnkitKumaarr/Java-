import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    System.out.println("Enter a number to find Factorial");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int res = 1;
    for(int i =num;i>=1;i--){
      res = res * i;      
    }
    System.out.println("Factorial of "+ num+" number is "+ res);
    sc.close();
    
  }  
}
