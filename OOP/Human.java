package OOP;

public class Human {
    String name;
    int age;
    double weight;
    char sex;

    Human(String name, int age, double weight,char sex){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    void eat(){
        System.out.println(this.name +" is eating");
    }
    void drink(){
        if (this.sex == 'M') {
            System.out.println(this.name +" is drinking Alcohol");

        }
        else {
            System.out.println(this.name+" is drinking soft drink");
        }
    }
}
