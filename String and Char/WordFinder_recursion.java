public class WordFinder_recursion {
    static boolean word(String mainStr, String wordStr,int i){  
         
        String strArray[];
        strArray = mainStr.split(" ");
        if(i == strArray.length){
            return false;
        } 
        if(strArray[i].equals(wordStr)){
            return true;
        }             
        
        return word(mainStr, wordStr, i+1);
    }
    public static void main(String[] args) {
        
        boolean result = word("This is Ankit", "Orange",0);
        if(result){
            System.out.println("Word has found in the given string");
        }
        else{
            System.out.println("Word has not founded in the given String");
        }
    }
}
