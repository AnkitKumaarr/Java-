import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division");
        System.out.println("Enter your choice ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        System.out.println("Enter first Number");
        int fnum = sc.nextInt();

        System.out.println("Enter Second  Number");
        int snum = sc.nextInt();
        int result =0;

        
        switch(ch){
            case 1: 
            result = fnum + snum;
                break;
            case 2:
            result = fnum - snum;
                break;
            case 3:
            result = fnum * snum;
                break;
            case 4: 
            result = fnum / snum;
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        System.out.println("The output is "+result);
        sc.close();
    }
}
