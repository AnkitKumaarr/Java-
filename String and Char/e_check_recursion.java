public class e_check_recursion {
    static void check(String word,int num){
        if(num == word.length()){
            return;
        }
        char ch = word.charAt(num);
        if(ch =='e'){
            System.out.println("The letter e founds at "+ (num+1));
        }
        check(word,num+1);
        
    }
    public static void main(String[] args) {
        check("umbrella",0);
        
    }
}
