public class counDigitReturn {
    static int countDigit(int num, int count){
        if(num==0){
            return count;
        }
        int r =countDigit(num/10,count +1);
        return r;

    }
    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        int r =countDigit(num/10);
        return ++r;

        // return 1 + countDigit(num/10);

    }
    public static void main(String[] args) {
        int e = countDigit(789654);
        System.out.println(e);
    }// jaate waqt arguments use honge function me 
    // aate waqt arguments km ho jaate hai
}
