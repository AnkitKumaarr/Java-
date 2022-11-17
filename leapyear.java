import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        int year; 
        System.out.println("Enter the year to find leap year or not");

        
        
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year%4==0){
            System.out.println("The entered year is a LEap Year");

        }
        else{
            System.out.println("The entered year is not leap year");
        }
        sc.close();
    }
}
