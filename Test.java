public class Test{
    // find out the output of this program
    static int start =2;
    final int end;
    public Test(int x){
        x=4;
        end =x;
    }
    public void fly(int distance){
        System.out.println(end-start + "");
        System.out.println(distance);
    }
    public static void main(String[] args) {
        new Test(10).fly(5);

    }
}