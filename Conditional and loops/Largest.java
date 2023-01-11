import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater than All");
            }
            else{
                System.out.println("C is greater than All");
            }
        } 
        else {
           if(b>c){
            System.out.println("B is greater than All ");
           }
           else{
            System.out.println("C is greater than All ");
           }
        }
        sc.close();
    }
}
