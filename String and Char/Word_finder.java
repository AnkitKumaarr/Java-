import java.util.Scanner;

public class Word_finder {
    public static void main(String[] args) {
        System.out.print("Enter a string--");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter a word to found in the entered string above --");
        String word = sc.next();

        String strArray[];
        strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            boolean  res = strArray[i].equals(word);
            if (res) {
                System.out.println("Yes, " + word + " is founded at "+(i+1));
                break;
            } else {
                System.out.println("NO, " + word + " is not is the given string");
            }
        }
        sc.close();

    }
}
