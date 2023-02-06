import java.util.LinkedList;
import java.util.List;

public class KidsWithCandiesLC1431 {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                list.add(i,true);
            }
            else{
                list.add(i, false);
            }
        }        
        return list;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));

    }
}
