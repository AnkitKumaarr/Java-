import java.util.Arrays;

public class ConcatenationArraysLC1929 {
//      Input: nums = [1,2,1]
//      Output: [1,2,1,1,2,1]
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        ans = traverse(nums, 0,ans);
        return ans;
    }
    static int[] traverse(int[] nums, int i, int[] ans){
        if(nums.length == i){
            return ans;
        }
        ans[i] = nums[i];
        ans[nums.length +i] = nums[i];
        return traverse(nums, i+1, ans);
    }
    static int[] getConcatenation2(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length +i] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation2(nums);
        System.out.println(Arrays.toString(ans));
    }
}
