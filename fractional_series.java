import java.util.Scanner;

public class fractional_series {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();
        float sum = 0;
        for(float i = n;i>=0;i--){
            sum = sum + 1/n;
        }
        
        System.out.println(sum);
        sc.close();
    }
}
