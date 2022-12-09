import java.util.Scanner;

public class patternBasic{
    public static void main(String[] args) {
        System.out.println("Enter the number of star you want to print");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i <5;i++){
            for(int j = 0;j<num;j++){
                System.out.print(j );
            }
            System.out.println();
        }
        sc.close();
    }
}