package feb.ex_03182025;

//Child Class
public class Car extends Vehicle{
    String model_name;
    int no_of_seating;
    int no_of_airbags;
    String brand;


    Car(){

    }
    Car(String model_name, int no_of_seating, int no_of_airbags, String brand){
        this.model_name = model_name;
        this.no_of_seating = no_of_seating;
        this.no_of_airbags = no_of_airbags;
        this.brand  = brand;
    }
    Car(String model_name, int no_of_seating){
        this.model_name = model_name;
        this.no_of_seating = no_of_seating;
    }
    Car(String model_name, String chassis, String body, boolean has_ABS, String fuel){
        this.model_name = model_name;
        this.chassis = chassis;
        this.body = body;
        this.has_ABS = has_ABS;
        this.fuel = fuel;
    }

    void start(){
        System.out.println("Engine is ON");
    }
    void stop(){
        System.out.println("Engine is OFF");
    }

}

