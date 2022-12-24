import java.util.Scanner;

public class Without_Length {
    public static void main(String[] args) {
        System.out.println("Enter a string --- ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int length = 0;
        for( char a : input.toCharArray()){
            System.out.println("charcater is ---- "+ a);
            length++;
        }
        sc.close();
        System.out.println(length);
    }
}
