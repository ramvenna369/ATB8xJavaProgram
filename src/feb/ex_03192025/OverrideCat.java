package feb.ex_03192025;

public class OverrideCat extends OverrideAnimal {

    String pet_name;

    OverrideCat(){

    }

    OverrideCat(String pet_name){
        this.pet_name = pet_name;
    }
@Override
    void bark(){
        System.out.println("Cat meows");
    }
}
