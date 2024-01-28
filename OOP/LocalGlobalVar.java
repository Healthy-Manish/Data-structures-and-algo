package OOP;

import java.util.Random;

public class LocalGlobalVar {
    int number = 0;
    Random random;//global

    LocalGlobalVar(){
        random = new Random();
        Random r2 = new Random();
        int num = 0;
//        roll();
         roll2( r2, num);
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    void roll2(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

    public static void main(String[] args) {
        LocalGlobalVar dice = new LocalGlobalVar();
    }



}
