import java.util.Arrays;

public class BuildArraysPermutationLC1920{
    // Input: nums = [0,2,1,5,3,4]
    // Output: [0,1,2,4,5,3]
    // Explanation: The array ans is built as follows: 
    // ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    // = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    // = [0,1,2,4,5,3]

    static int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums[i]];
        }
        return nums2;
        
    }
    
    static int[] buildArrayRecursion(int[] nums){
        int[] nums2 = new int[nums.length];
        nums2 = converter(nums, 0, nums2);
        return nums2;    
    }
    static int[] converter(int[] nums, int i, int nums2[]) {
        if(i == nums.length){
            return nums2;
        }
        nums2[i] = nums[nums[i]];
        return converter(nums, i+1, nums2);    
    }
    
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] res = buildArrayRecursion(nums);
        System.out.println(Arrays.toString(res));

    }
}