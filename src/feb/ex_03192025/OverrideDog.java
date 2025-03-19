package feb.ex_03192025;

public class OverrideDog extends OverrideAnimal{
    //this is example for Override
    String pet_name;

    OverrideDog(){

    }

    OverrideDog(String pet_name){
        this.pet_name = pet_name;
    }
@Override
    void bark()
    {
        System.out.println("Dog barks");
    }

}
