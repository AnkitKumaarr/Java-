import java.util.Scanner;

public class multipleifelse {
    public static void main(String[] args) {
        System.out.println("1. Drinks");
        System.out.println("2. Sweets");
        System.out.println("3. Snacks");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        
        int choice = sc.nextInt();

        if(choice ==1){
            System.out.println("Drinks");
        }
        else if(choice ==2){
            System.out.println("Sweets");
        }
        else if(choice ==3){
            System.out.println("Snacks");
        }
        else {
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}
