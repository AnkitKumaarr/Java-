public class series {
    static void number(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }        
        number(n-1);
        if(n%2==0){
            System.out.println(n);
        }
        
    }
    public static void main(String[] args) {
        // 
        number(5);
        

    }
}
