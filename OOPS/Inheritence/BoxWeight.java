package OOPS.Inheritence;

public class BoxWeight extends BOX{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//call the parent class constructor
        //use to initialize values present in parent class
//        if you have same variable in parent class then with the help of super keyword instead of this
//        you can find value of the variable from the parent class
        this.weight = weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

}
