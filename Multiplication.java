import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number till you want table to print :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=10;j++){
                System.out.println(i+"x"+j +"="+ i*j);
            }
            System.out.println("\t");
        }
        sc.close();
    }
}
