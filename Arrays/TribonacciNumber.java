public class TribonacciNumber {
    static int tribonacci(int n) {
        int t1 = 0, t2 =1, t3 = 1;
        if(n ==1){
            return 0;
        }

        if(n ==2){
            return 1;
        }
        if(n ==3){
            return 2;
        }        
        int res = t1 + t2+t3;
        while(n > 3){
            
            t1 = t2;
            t2 = t3;
            t3 = res;
            n--; 
            res = t1 + t2+t3;           
        }
        return res;
    }
    public static void main(String[] args) {
       // tribonacci(4);
        System.out.println(tribonacci(25));
    }
}
