class Encapsulation {
    /*
    
    Prerequsites -- data hiding and abstraction 

    Abstraction hota hai methods ke implemenatation  ki hide krke rkhna 
    or data hiding ka matlab hai ki data (member variable) ko private rkhna

    abstraction complete hota hai.. interface or abstract class/method ka use karke

    or data hiding me use hota hai khali... variables ko  private krke pr isme getter or setters bhi aate hai ..


    ab inka encapsulation se kya matlab...

    matlab hai ki in dono ko mila kr agr hm program bnate hai ya app ya software to wo Encapsulation hota hai ..

    yaani hm keh skte hai..

    Encapsulation = data hiding + Abstraction


    ye hui ek defination.. dusri ...-->

    grouping up data members and corresponding members is called Encapsulation

    

    bahut asaan smjhna hai to ise hm samjhange ki saara ka saara data ko or members
    ko ek box me  pack kr do taaki bahar wala access or implementation na dekh paaye 


    Advantages --

    1. Security
    2. Enhancement --> can change background code without affecting Users....
    3. Maintainability --> code maintain rehta kuch change nahi hota jaisa rkho waise rkho...


    Disadvantage --

    too much coding ---- mtlb hai ki .... 
                agr hme kuch access krna bhi hai to pehle usko object bnao phir getter method call kro..
                nahi to agr variable agr public ho to direct access kr lo or baat khtm pr Security ke chkkr me code of lines bd jati hai
    
    
    
    Tightly Encapsulation --->

    ek class me agr saare varible  private ho to use tightly encapsulation kehte hai...
    isme method se hme mtlb nahi hai...

    Example---

    class A{
        private int a =12;
    }

    A class tightly encapsulation hai...

    class A{
        int a =17;
    }

    ab ye class tightly encapsulation nahi h..


    agr parent me ek bhi variable private nahi h to uske child bhi tightly encapsulated nahi honge

    class B extends A{
        private String b = "";
    }
    ab ye class tightly Encapsulated nahi hai ....
    */
}