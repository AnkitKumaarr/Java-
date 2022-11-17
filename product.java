import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        int cp, sp,result;
        System.out.println("Enter product Cost Price");
        Scanner sc = new Scanner(System.in);

        cp = sc.nextInt();
        System.out.println("Enter Selling Price");
        sp = sc.nextInt();

        result = sp-cp;

        if(result>0){
            System.out.println("The Profit amount on the product is " +result);
        }

        else{
            System.out.println(" Your are in loss after selling this product is " +result);
        }
            sc.close();
    }
}
