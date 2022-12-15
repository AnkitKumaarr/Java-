class countDigit{
    static void countDigitfn(int num,int count){
        if(num==0){
            System.out.println(count);
            return;
        }
       // num = num/10;
        num = num/10;
        count++;
        countDigitfn(num,count);

    }
    public static void main(String[] args) {
       
        countDigitfn(76543,0);
    }
}