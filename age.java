import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        
        System.out.println("Enter Your Age");
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

         if(age>=18){
            System.out.println("You can apply for Driving Liscence");

         }
         else{
            System.out.println("You are underaged");
         }
         //maven/
         sc.close();
    }
}
