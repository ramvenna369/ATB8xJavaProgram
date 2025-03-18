package feb.ex_03182025;

public class CarRunner {
    public static void main(String[] args) {

        //Runner
        Car XUV = new Car("XUV 700", 7, 2, "Mahindra");
        String brand = XUV.brand;
        System.out.println(brand);
        XUV.start();
        XUV.stop();

        Car Lambo = new Car("Urus SE", "3996", "Big", true, "Petrol");
        String model_name = Lambo.model_name;
        System.out.println(model_name);
        String fuel_type = Lambo.fuel;
        System.out.println(fuel_type);

    }


}
