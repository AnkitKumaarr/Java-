public class CountOddNumbers {
    static int countOdds(int low, int high) {
        int oddCount =0;
        if(low%2 ==0){low++;}
        while (low<=high) {
            oddCount++;
            low+=2;
        }
        return oddCount;
    }
    public static void main(String[] args) {
        int res = countOdds(8, 10);
        System.out.println(res);
    }
}
