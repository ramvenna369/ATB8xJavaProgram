package feb.ex_03182025;

public class Vehicle {
    String body;
    String chassis;
    boolean has_ABS;
    String fuel;

    Vehicle(){

    }
    //Parent or Base Class

    public Vehicle(String chassis, String body, boolean has_ABS, String fuel) {
        this.chassis = chassis;
        this.body = body;
        this.has_ABS = has_ABS;
        this.fuel = fuel;
    }

}


