import java.util.Arrays;

public class SwapElementsArray {

    // WAP  to swap the elements at the given index
    public static void main(String[] args) {
        int arr[] = {5,32,4,96,14,12};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
}
