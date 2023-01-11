import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(" Enter a  number to find  the  reverse of it --");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev =0;

        while( number > 0){
            int rem = number% 10;
            rev = rev *10 + rem;
            number = number/10;            
        }
        System.out.println(rev);
        sc.close();
    }
}
