import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,9,3,99};

        int[] temp = new int[arr.length];
        int k =0;
        for (int i = arr.length-1; i >= 0; i--) {
            temp[k] = arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
