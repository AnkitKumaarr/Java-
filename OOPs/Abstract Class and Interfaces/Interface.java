public interface Interface {
    /*
                                            Interface 

    Maan lo tumhare pass ek client (ya normal insaan) aata h or kehta hai ki mujhe ek App bnwaana hai..
    ab wo kuch chije btayega ki kis type ka bnawana hai kya kya hona chahiye 
    
    
    ab btayega ki mujhe ye service chahiye pr wo service hogi kaise wo ye btayega nahi 
    wo apko khud likhni pdegi 

    dusre tarike se smjhe to wo kya krega ki bologa mujhe ye chahiye pr uski coding yaani langauge ya program 
    nahi btayega ki kaise hoga uska program aapko khud likna hoga

    or achhe se smjhe to wo bol dega ki mujhe service chahiye pr wo service ka naam btayega pr implementation nahi btayega..
    wo apko krne ko bologe ki tum kro or tbhi paise dunga nahi to nahi....

    smjho ki usne bola ki mujhe ye app ke liye ek m1 method chahiye ek m2 ek m3 ..
    to kya hm un teeno  ko aise likh skte hai kahi pr ...

    abstract void m1();
    abstract void m2();
    abstract void m3();

    ab ye teen method ho gyi hai or ye teeno abstract to ise hm abstract class bna skte hai pr... 
    agr isko hm abstract class bnaete to iska nuksaan abhi hm aage dekhte hai kya hai ....


    ab teeno method bn gayi aise wo jo client bahut saare methods btayega...
    or lagbhag use bahut kuch servives chahiye uske software me... 
    pr as a develper koi bhi methods jo wo bta rha hai hmne likh li abstract ke jariye ..

    pr agr implements krte waqt छूट gayi to ... to iske liye hm kya krenge use 
    ek Interface ke block me daal denge

    interface ClientMethods{
        abstract void m1();
        abstract void m2();
        abstract void m3();
    }

    ab ye jo methods hmne likh li hai use define krni hogi ek ek krke ... 
    taki jo client chahta hai wo ban jaaye...

    to ye to hm usi class(interface) me krenge to wo bahut complex ho jayega..

    to hm ek alg class bnayega jo ki ye methods solve kr rha hoga ...

    to us class ko btana pdega ki haa me hu jo ye client ki methods use define krunga 

    to us class ko likhna pdega implements keyword or aage interface ka naam

    jaise ki .. 

    class Ankit implements ClientMethods{

    }

    isne jaise hi implements likha to iski majboori ho jayegi ki jo us interface me abstract methods
    wo saari ki saari define krni pdegi agr nahi ki to code compile time pr hi error de dega...

    isse hoga kya ki koi bhi method jo client ne btayi to wo छूटegi nahi kyunki code compile hi nahi hoga

    isiliye hme interface ki jaroorat padi..... agr normal abstract class hoti to hm kuch na kuch methods 
    bhool jaate ya chhod dete pr  isse hmara  nuksaan hota hai 


    pr agr hmne do methods define kr di ... or 3sri yaa aage ki methods hmse nahi ho paati 
    to hme kya krna pdega... ye to code compile hone nahi dega...

    to hm class ke naam ke aage ek keyword lga denge abstract or abstract ka mtlb hm sb jaante hi hai incomplete


    class abstract Ankit implements Interface{
    @Override
    public void m1() {
        System.out.println("I Am Method 1");
    }
    @Override
    public void m2() {
        System.out.println("I Am Method 2");
    }    
    }

    */
    abstract void m1();
    abstract void m2();
    abstract void m3();

    
}
