import java.util.Scanner;

public class ASCII_String_Recursion {
    
    static void  ascii(String input, int i){
        if(i ==input.length()){
            return;
        }
        char ch = input.charAt(i);
        int asc = input.charAt(i);
        System.out.println("The ASCII of " +ch +" is "+ asc);
        ascii(input, i+1);
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a char ");
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        ascii(input,0);        
        sc.close();
    }
}
