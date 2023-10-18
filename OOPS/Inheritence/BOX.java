package OOPS.Inheritence;

public class BOX {
//     Inheritence
    double l;
    double h;
    double w;
    BOX(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //make a cube
    BOX(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    BOX(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    BOX(BOX old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
