public class SumOfNto1 {
    // addition
    static int sum(int num){
        if(num == 0){
            return num ;
        }
        return num + sum(num/10);
    }
    public static void main(String[] args) {
       int res =  sum(123);
       System.out.println(res);
    }
}
