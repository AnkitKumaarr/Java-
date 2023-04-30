public class MultipleInhetritance extends BoxWeight{
    int  naam = 14;
    
    public static void main(String[] args) {
        MultipleInhetritance obj = new MultipleInhetritance();
        System.out.println(obj.weight);

        //  maan lo agr 2 alag alag parent ke pass same 2 variable hai .. 
        // or agr child ko us ek variable ko use krta hai to wo kaise decide krega ki kon se parent ka 
        // variable ise kru...

        //  isiliye Java me Multiple Inheritance ka Concept nahi hai...

        // Multiple Inheritance is not allowed in Java 
        //  but we  can do this by using Interfaces
    }
}
