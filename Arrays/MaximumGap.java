import java.util.Arrays;

public class MaximumGap {
    static int maximumGap(int[] nums) {
        if(nums.length <2) {
            return 0;
        }
        Arrays.sort(nums);
        int gap=0;
        int maxGap =0;
        for (int i = 0; i < nums.length-1; i++) {
            gap = nums[i+1]-nums[i];
            if(gap > maxGap){
                maxGap = gap;
            }
        }
        return maxGap;
    }
    public static void main(String[] args) {
        int[] nums = { 3,6,9,1,15};
        int res = maximumGap(nums);
        System.out.println(res);
    }
}
