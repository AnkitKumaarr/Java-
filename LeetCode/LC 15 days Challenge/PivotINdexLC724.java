import java.util.Arrays;

public class PivotINdexLC724 {
    static int pivotIndex(int[] nums) {
        final int sum = Arrays.stream(nums).sum();
        int prefix = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (prefix == sum - prefix - nums[i])
                return i;
            prefix += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 6, 5 };
        System.out.println(pivotIndex(arr));
    }
}
