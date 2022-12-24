import java.util.Scanner;

public class e_check {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char array[] = new char[string.length()];
        for(int i =0; i<array.length;i++){
            array[i] = string.charAt(i);
            if(array[i] == 'e'){
                System.out.println("e founds at "+ i);
            }
        }
        sc.close();
    }
}
