public class StringSearch {
    public static void main(String[] args) {
        String name = "Ankit";
        char chr = 'r';
        System.out.println(searchChar(name, chr));

    }
    static boolean searchChar(String str, char letter){
       for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if(chr == letter){
                return true;
            }
            str = str.substring(0,str.length());
       }
        return false;
    }
}
