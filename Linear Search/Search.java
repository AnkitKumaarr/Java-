public class Search{
    public static void main(StringSearch[] args) {
        int[] arr = { 58,64,88,34,46,66,4,7};
        System.out.println(searchInt(arr, 4));

    }
    static int searchInt(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}