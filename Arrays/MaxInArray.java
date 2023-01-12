public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {4,85,98,12,45,36,97};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }   
}
