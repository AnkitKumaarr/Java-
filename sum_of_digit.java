public class sum_of_digit {
 static int sum(int num ,int sum){
    if(num%10==0){
        return sum ;
    }
    return sum(num/10,sum + num%10);

 }  
 public static void main(String[] args) {
    int result = sum(12345,0);
    System.out.println(result);
 } 
}

