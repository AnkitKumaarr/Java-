import java.util.LinkedList;
import java.util.List;

public class AddItionOfArrayLC989 {
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new LinkedList<>();
    
        for (int i = num.length - 1; i >= 0; --i) {
          ans.add(0, (num[i] + k) % 10);
          k = (num[i] + k) / 10;
        }
    
        while (k > 0) {
          ans.add(0, k % 10);
          k /= 10;
        }
    
        return ans;
      }
    public static void main(String[] args) {
        int[] nums = {2,1,5};
        int k = 806;
        List<Integer> res =   addToArrayForm(nums, k);
        System.out.println(res);
    }
}
