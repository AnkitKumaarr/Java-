import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element value of " + (i + 1) + "   ---");
            array[i] = sc.nextInt();

        }
        int highest_number = array[0];
        // highest number
        for (int i = 1; i < array.length; i++) {

            if (highest_number < array[i]) {
                highest_number = array[i];
            }

        }
        // lowest number
        int lowest_number = array[0];
        for (int i = 1; i < array.length; i++) {
            if (lowest_number > array[i]) {
                lowest_number = array[i];
            }
        }

        System.out.println("The largest value is " + highest_number);
        System.out.println("The lowest  value is " + lowest_number);
        sc.close();

    }
}
