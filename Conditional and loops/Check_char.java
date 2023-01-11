import java.util.Scanner;

public class Check_char {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if( ch>= 'a' && ch<= 'z'){
            System.out.println(" Entered character " + ch+" is in small case");
        } 
        else{
            System.out.println(" Entered character " + ch +" is  not in small case");
        }
        sc.close();
    }
}
