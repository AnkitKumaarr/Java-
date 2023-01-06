import java.util.Arrays;

public class PassingArraysInFunction {
    public static void main(String[] args) {
        int[] a ={12, 10, 2, 65};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int[] x){
        x[0] =465;
    }
}
