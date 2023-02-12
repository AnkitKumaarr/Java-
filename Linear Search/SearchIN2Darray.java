import java.util.Arrays;

public class SearchIN2Darray {
    public static void main(String[] args) {
        int[][] nums = {
            {4,3,8,1,},
            {12,65,98,46,66},
            {11,18,19,64,63,77},
            {23,36,78,13,14}
        };
        System.out.println(Arrays.toString(search(nums, 12) ));
    }

    static int[] search(int[][] nums, int target){
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return nums[0];
    }
}
