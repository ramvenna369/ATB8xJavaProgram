package feb.ex_04212025;

public class Lab021 {
    public static void main(String[] args) {


        People p1 = new People();
        p1.name = "Anil";
        p1.sex = 'M';
        // p1.blood_colour; throws error because blood colour is already defined
        p1.run();

        System.out.println(p1.name);
        System.out.println(p1.sex);
        System.out.println(p1.blood_colour);

        People p4 = new People();
        System.out.println(p4.blood_colour); //here blood colour is red because it is static
        System.out.println(p4.name); //here name is NULL because we didn't not assign

        People p2 = new People("Ram","Hyderabad",27,'M',"Blue");
        //I gave blood_colour as Blue, it didn't throw error but updated blood colour as Blue
        System.out.println(p2.address);
        System.out.println(p2.name);
        System.out.println(p2.blood_colour);
        p2.sleep();
        p2.work(); //normal function/method or static function, I don't see difference. Check

        People p3 = new People();
        System.out.println(p3.blood_colour); // here blood colour is blue because static is update as Blue now.

    }
}
