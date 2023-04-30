public class SingleInheritance extends BoxWeight {

    int naam;
    SingleInheritance(){
        super();
    }
    SingleInheritance(BoxWeight side, int naam){
        // super(side);
        this.naam = naam;
    }

    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();
        System.out.println(obj);
    }
}
