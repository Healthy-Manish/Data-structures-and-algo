package OOP;

public class arrayOfObj {

    String name;
    arrayOfObj(String name){
        this.name = name;
    }


    public static void main(String[] args) {
        arrayOfObj[] Refrigerator = new arrayOfObj[3];

        arrayOfObj food1 = new arrayOfObj("Pizza");
        arrayOfObj food2 = new arrayOfObj("Hamburger");
        arrayOfObj food3 = new arrayOfObj("Hotdog");

        Refrigerator[0]= food1;
        Refrigerator[1]= food2;
        Refrigerator[2]= food3;
        System.out.println(Refrigerator[2].name);

    }
}
