import java.util.Scanner;

public class OddEvenPlaceAddition {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = number;i!=0;i=i/10){
            i = i/10;
            int rem =i%10;
            sumEven = sumEven +rem;
        }
        for(int i = number;i!=0;i=i/100){
            int rem =i%10;
            sumOdd = sumOdd +rem;
        }
        System.out.println("The Even place addition is "+sumEven);
        System.out.println("The Odd place addition is "+sumOdd);
        sc.close();
    }
}
