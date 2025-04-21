package feb.ex_04212025;

public class People {

    String name;
    String address;
    int age; //throws error if short. Why?
    char sex;
    static String blood_colour="Red";

    People(String name, String address, int age, char sex, String blood_colour){
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.blood_colour= blood_colour;
    }

    public People() {

    }

    void run(){
        System.out.println("He is running");
    }
    void sleep(){
        System.out.println("He is sleeping");
    }
    static void work(){
        System.out.println("He is working");
    }

}
