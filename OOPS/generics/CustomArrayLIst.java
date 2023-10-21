package OOPS.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayLIst {

    private  int[]data;
    private  static int DEFAULT_SIZE = 10;
    private  int size = 0;
    public CustomArrayLIst() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]= num;
    }
    private void  resize(){
        int[] temp = new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data = temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public int set(int index,int value){
        return data[index]=value;
    }
    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString(){
        return "CustomArrayLIst{" +
                "data="+ Arrays.toString(data)+
                ",size="+size+
                '}';
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(34);
//
//        list.get(0);
//        list.set(1,234);
//        System.out.println(list);
        CustomArrayLIst list = new CustomArrayLIst();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);


    }
}
