public class Singleton {
    
    private static Singleton instance;

    private Singleton(){
        System.out.println("I m Singleton  Class");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


    // Singleton classes wo classess hoti hai jisse hm aisi condition bnate hai coding se jisse user ek 
    // se jyada object na bna sake ......
    //  agr bante bhi hai to usi ek object ko hi reference krenge

    // 

    // Singleton obj = Singleton.getInstance();
    // Singleton obj2 = Singleton.getInstance();
    
}
