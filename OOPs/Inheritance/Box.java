public class Box {
    int h;
    int w;
    int l;
    int colour;

    int weight = 12;

    Box(){
        System.out.println("I am Box default Constructor....");
    }
   

    Box(int side){
        super();
        this.h = side;
        this.w = side;
        this.l = side;
        
    }
    Box(int h, int w, int l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    
    Box( Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
        System.out.println("A box has called bcoz ise hona hai bhaii");
    }
}
