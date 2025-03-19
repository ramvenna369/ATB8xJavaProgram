package feb.ex_03192025;

public class OverrideAnimal {

    String breed;
    short age;

    OverrideAnimal(){

    }
    OverrideAnimal(String breed, short age){
    this.breed = breed;
    this.age = age;
    }
    void bark(){
        System.out.println("Animal make sound");
    }

}
