
public class Super extends Box{
    int colour;

    Super(int h,int w,int l, int colour){    //ye ek constructor hai 
        super(1,2,4);
        super.colour =  colour;

        // super. variables se hm parent ke class ki properties use kr skte hai....
        // or this. se usi class ki properties jo usme hai 
        //  example ke liye...
        System.out.println(super.colour);
        // uper wali line parent class ke colour ko access kregi 
        System.out.println(this.colour);
        // or ye wali line isi class me jo colour hai use

        // super or this isiliye hai kyunki kbhi kbhi ya jydataaar parent or child me same naam ke variables ho skte hai



        // super() hmesha child ke constructor ke andr turant call kr do kyunki agr parent se child hai 
        // to pehle child property inherit krta  hai naa ki pehle apni alg property bnata hai aisa 
        // isiliye kyunki agr child pehle hi property declare kr dega to Duplicacy aayegi class me or 
        // duplicacy/ Redudancy aa gyi to kya fyda inheritance ka

        // kulmilakr child ko fikar hai ki uska parent use kya dena chahta hai.. tab wo apni jindagi aage 
        // shuru krega pr parents se thode na kuch matlab hai

    }
    Super(Super other){
        super(other);
        System.out.println("this has called");
        // is line ka matlab hai ki Super ek class/ datatype hai or usi ka other uska object 
        // or ab ye other call kr rha hai parent class Super ki yaani ki Box ko 


        //  super(other) wali line  parent class ke aise  constructor ko call kr rahi hai ko ki other ko 
        // as a parameter le rahi hai
    }
    
    

    public static void main(String[] args) {
        // Box box1 = new Super(1,2,5,4);
        Super obj1 = new Super(1, 5, 43, 7);
        Super obj2 = new Super(obj1);
        System.out.println(obj2);

        //  super is a keyword  jo use hota hai ki parent class ke properties ko access krne ke liye 
        //  Java me hr ek class ki super class hai Object() class 
        //  chahe hmari bnayi class ho ya system ki predefined class


        // if super is not define in child then it will always call default constructor of the parent class

    }
}
