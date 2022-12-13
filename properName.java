import java.util.Scanner;
public class properName {
    // Input - ankIT kUMAr
    // Output - Ankit Kumar
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        String arr[] = name.split(" ");
        String fullName = "";
        for(String word : arr){
            String n = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
            fullName = fullName + n +" ";
            
        }
        System.out.println(fullName);
        sc.close();
    }
}
