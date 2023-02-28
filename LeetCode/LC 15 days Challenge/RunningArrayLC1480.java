import java.util.Arrays;

public class RunningArrayLC1480{
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0]; 
        for (int i = 1; i < ans.length; i++) {
            ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}