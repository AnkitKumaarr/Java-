public class SearchInsertPositionLC35 {
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;        
    }
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 7;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
}
