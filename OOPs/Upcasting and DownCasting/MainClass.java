public class MainClass{
    public static void main(String[] args) {
        Ankit obj = new Ankit();
        Prashant obj2 = (Prashant)obj;
        System.out.println(obj2);

        //                             Upcasting

        //  Upcasting matlb ki child class ko parent me change krna...
        //  Ankit obj = new Ankit();
        //  ye uper hmne ek Ankit class (child) ke object ko bnaya jo ki memory me ek space lega.
        //  Prashant obj2 = (Prashant)obj; 
        //  ab hmne obj2 yaani parent ka ek reference bnaya 
        // pr ye access same wahi class kr paa rha hai jo child ka bna hai already 


        //  ye hmne explicitly kiya hai ....yaani khud se 
        //  ab agr hm dono object ko print kre ... 
        // to iska answer same hoga ki dono reference same @hascode print kr rahe honge....

        //  ise hm seedhe bhi likh skte the .......
        // Prashant obj3 = new Ankit();
        //  ab hmne jo casting krke reference bnaya hai us kya kya access kr skte hai....
        //  usse hm saare variable or method access kr skte hai jo ki parent class me hai or 
        //  child class ke wahi method or variable access kr skte hai jo same name ke hai.....
        //  same naam ke function child me override krenge parent class ke method ko.....


        // Prashant obj3 = new Ankit();

        // System.out.println(obj);
        // System.out.println(obj2);
        // System.out.println(obj3);
        // obj3.greeting();

        //  hr ek class subclass hai Object class ki agr hm yha pr object me cast kre to 
        //  to wahi function call/ access kr payenge jo ki object class me hai......
        //  agr wo function call krenge to compile time error dega.....


        //                              Downcasting
        //  Upcasting se hm khali wo hi access kr paate hai jo ki parent ke pass hai or wo methods jo ki 
        //  same naam ke bane huye hai child me .... or wo access nahi kr paate jo ki child class ke andr hai 
        
        //  is problem ke liye hm kya krenge pehle upcasting krenge or phir dubara 
        //  se object ko child me cast(change) kr denge  

        //  is process kr downcasting kehte hai .... 

        // krte kaise hai wo dekh lete hai.....

        //  pehle krenge upcasting ...
        // Prashant p = new Ankit();
        //  ab is p object ko change krenge child me 
        //  yaani 
        // Ankit a = (Ankit)p;
        // ab hm access kr payenge sbhi chije jo ki child ke pass hai 


        
        Prashant p = new Ankit();
        Ankit a = (Ankit)p;
        a.greeting();
        System.out.println(p);
        System.out.println(a);

        //  but agr hm ise object class ko parent maane to kya aisa hoga..... 
    }
}
