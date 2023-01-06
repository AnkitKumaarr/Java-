import java.util.*;

public class Array_basic_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //1st method -- for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 2nd method -- enhanced loops
        for (int num : arr) {
            System.out.println(num);
        }
        //3rd method using toString() function
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
