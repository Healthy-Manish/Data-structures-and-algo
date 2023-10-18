package OOPS.Inheritence;

import javax.swing.*;

public class BoxPrice extends BoxWeight{
//    Multilevel inheritance example
    double cost;
    BoxPrice(){
        super();
        this.cost =-1;
      }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }


}
