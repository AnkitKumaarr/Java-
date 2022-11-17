import java.util.Scanner;

public class Check_character {
    public static void main(String[] args) {
        System.out.println("Enter a Character to find it is a alphabet, digit or special character");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch +" is an Alphabet");
        }
        else if(ch>= '0' && ch<= '9'){
            System.out.println(ch+" is a Digit character");
        }
        else{
            System.out.println("Character is Special character");
        }
        
        sc.close();
    }    
}
