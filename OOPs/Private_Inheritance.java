public class Private_Inheritance {
    public static void main(String[] args) {
        

        //                               Private 


        // private jiske aage lgate hai wo... sirf or sirf usi file me access kiya jaa skta hai....
        /* child to parent */

        // this error becuse parent kaise jaan skte hai ki uske child ki properties kya hongi..
        // or jo property inherit hongi wo to pehle se hi parent ke pass hai..
        // to agr aisa logic banta bhi to wo waste hota hai programming ke hisaab se ...confusion paida krta 
        // to below line bekar hai error ......

        // BoxWeight box1 = new Box(12,4,31);




        /* parent to child */
        Box box1 = new BoxWeight(1, 5, 6, 7);

        // uper wali line ka matlab hai ki Box datatype banega box1 
        // pr uske andr call sirf Box ki value hi ho skti hai mtlb khali h,l,w bs na ki weight kyunki 
        //   weight to Box datatype me hai hi nahi to hum keh sakte hai ki datatype se hi decide hoga ki 
        //  jo object bna hai uske andr kya kya value hongi
        //  yaani ki Box datatype se decide hoga ki 

        System.out.println(box1.h);
        

    }

}

