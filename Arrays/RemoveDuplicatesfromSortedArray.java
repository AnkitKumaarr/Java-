import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,7,1,2,2,3,3,4};
        int[] expectedOutput =new int[nums.length];
        
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            boolean exist = false;
            for(int j =0;j<expectedOutput.length;j++){
                if(nums[i] == expectedOutput[j]){                    
                    exist = true; 
                    break;                   
                }
            }
            if(!exist){
                expectedOutput[index] = nums[i];
                index++;
            }             
        }
        System.out.println(Arrays.toString(expectedOutput));    
    }
}
