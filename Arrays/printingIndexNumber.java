import java.util.Scanner;

public class printingIndexNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size of array you want");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        //input
        for(int i = 0; i<size; i++){
            System.out.println("Enter the array element " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find index number ");
        int find = sc.nextInt();

        for(int i = 0;i<size;i++){
            // System.out.println(array[i]);

            if(array[i] == find){
                System.out.println("the given number "+ find +" index number is ----" + i);
            }
        }

        
        sc.close();
    }
}
