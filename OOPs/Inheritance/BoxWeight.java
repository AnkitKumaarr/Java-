public class BoxWeight extends Box {
    int weight =17;

    BoxWeight(int l, int w, int h, int weight){
        super(l,w,h);
        this.weight  = weight;
       
    }

    BoxWeight(){
        System.out.println("I am nothing...");
    }
    

    BoxWeight(BoxWeight obj){
        super(obj.h, obj.w, obj.l);
        
    }
   
    BoxWeight(BoxWeight obj, int weight){
        super(obj.h, obj.w, obj.l);
        this.weight = weight;
    }


   
}
