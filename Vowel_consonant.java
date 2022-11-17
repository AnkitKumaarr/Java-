import java.util.Scanner;

public class Vowel_consonant {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet Character to know its a vowel or a consonant");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        
        if(Character.isUpperCase(chr)){
            if(chr=='A'|| chr =='E'|| chr=='I' || chr =='O'|| chr =='U'){
                System.out.println("The entered Character " +chr +"is a Vowel");
            }
        
            else{
                System.out.println("The entered Character " +chr +" is a consonant");
            }
        }
        else{
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                System.out.println("The entered Character "+ chr +" is lower Vowel!");
            }
            else{
                System.out.println("The entered Character "+ chr +" is lower Constant!");
            }
        }
        

        sc.close();
    }
}
