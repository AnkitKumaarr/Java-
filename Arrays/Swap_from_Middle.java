import java.util.Arrays;

public class Swap_from_Middle {

    static String rev(int[] arr, int n) {
        if(n ==0){
            return "";
        }
        rev(arr, n-1);
        int[] temp = new int[1];
        for (int i = arr.length-1; i >= 1; i--) {
            temp[0] = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp[0];            
        }
        
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 120, 12, 54, 1, 5};
        String res = rev(arr, n);
        System.out.println(res);
    }
}