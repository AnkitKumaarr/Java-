import java.util.Scanner;

public class checkArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of a array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i<size;i++){
            System.out.print("The value at the place of "+ i + "   --");
            arr[i] = sc.nextInt();
            System.out.println();
        }   
        System.out.println("Enter a number to check sum");
        int num = sc.nextInt();
        // num = arr[0] + arr[0+1];
        // System.out.println(num);


        for(int i = 0;i<size-1;i++){
            if(num == arr[i] + arr[i+1]){
                System.out.println("Sum is equal");
                break;
            }
            else{
                System.out.println("NO Value Matched");
            }
        }
        sc.close();
    }
}