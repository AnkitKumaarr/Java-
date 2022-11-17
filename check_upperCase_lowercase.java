import java.util.Scanner;

public class check_upperCase_lowercase {
    public static void main(String[] args) {
        System.out.println("Enter  a Character to know its in Uppercase or in lowercase");  
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);

        if(chr >= 'a'){
            System.out.println("Character is in Lowercase");
        }
        else if(chr>='A'){
            System.out.println("Character is in UpperCase");
        }
        else{
            System.out.println("Wrong Input");
        }


        sc.close();
    }
}
