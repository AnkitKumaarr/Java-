import java.util.ArrayList;
public class DiceCount {
    static ArrayList<String> dice(int source, int target){
       if( source == target){
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        return list;
       }
       if(source > target){
        ArrayList<String> list = new ArrayList<>();
        return list;
       }
       ArrayList<String> result = new ArrayList<>();
       for(int dice = 1; dice<=6;dice++){
            int  current = source + dice;
           ArrayList<String> list  = dice(current, target);
           for( String str : list){
            result.add(str + dice);
           }
       }   
       
       return result;
    }
    public static void main(String[] args) {
        ArrayList<String> result = dice(0, 5);
        System.out.println(result);
        
    }
}
