public class Print1to10 {
    static void printvalue(int num){
        if(num==0){
            return;
        }
        printvalue(num-1);
        // we are printing sout here while stack is falling ----- stack fall
        System.out.println(num);
    }
    public static void main(String[] args) {
        printvalue(10);
    }
}
