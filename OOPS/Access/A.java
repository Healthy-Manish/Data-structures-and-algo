package OOPS.Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
   public A(int num,String name){
       this.num = num;
       this.name = name;
       int[] arr = new int[34];
   }
}
