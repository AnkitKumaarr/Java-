import java.util.Arrays;

public class ShuffleArrayLC1470 {
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i =0;
        int j = 1;
        int k =0;
        while (n<nums.length) {            
            ans[k] = nums[i];
            ans[j] = nums[n];
            i++;
            j = j +2;
            k = k +2;
            n++;
        }
        return ans;
        // for (int i = 0; i <nums.length; i++) {
        //     ans[i] = nums[i];
        //     ans[i+1] =  nums[n+i];            
        // }
        
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
}
