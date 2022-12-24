import java.util.Scanner;

public class ASCII_string {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
  
        char[] array = new char[input.length()];
        
        for(int i=0;i<array.length;i++){
            array[i] = input.charAt(i);
            
        }
        for(int i : array){
            System.out.print(i);
        }
        
        
        sc.close();
    }
}
