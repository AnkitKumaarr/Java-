import java.util.Arrays;

public class RunningSumArrayLC1480 {
    // Input: nums = [1,2,3,4]
    // Output: [1,3,6,10]
    // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans =  traverse(nums, 0, ans,0);
        return ans;
    }
    static int[] traverse(int nums[], int i, int[] ans, int sum){              
        if(nums.length == i){
            return ans;
        }
        sum += nums[i];
        traverse(nums, i+1, ans, sum);
        ans[i] = sum;
        return ans;
    }
    static int[] runningSumLoop(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum+= nums[i];
        }
        ans[nums.length-1] = sum;
        for (int i = nums.length-2; i >=0; i--) {
            sum = sum- nums[i+1];
            ans[i] = sum; 
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSumLoop(nums);
        System.out.println(Arrays.toString(ans));
    }
}
