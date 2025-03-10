package feb.ex_Task;

public class Sept18Task {
    //I completed previous tasks as part of ex_02272025
    public static void main(String[] args) {
        System.out.println("Type Casting");
        //Widening - Implicit, Explicit. Narrowing - Implicit, Explicit

        short No_of_people_in_family = 4;
        System.out.println(No_of_people_in_family);
        int country_population = No_of_people_in_family; //implicit widening
        System.out.println(country_population);
        int state_population = (int)No_of_people_in_family; //explicit widening
        System.out.println(state_population);
        //Note: while widening, JVM already knows; no need to mention specifically
        //also no error while storing small bytes on to large byte

        float food_bill = 47.89f;
        System.out.println(food_bill);
      //  int bill_roundoff = food_bill; //implicit narrowing;error
       // System.out.println(bill_roundoff);
        //JVM can't storage large Bytes to small; we can explicity force JVM though
        // but there will be data loss
        int roundoff_bill = (int)food_bill; //explicit narrowing but there will be data loss
        System.out.println(roundoff_bill);

        //increment - pre, post & decrement - pre, post concepts
        System.out.println("Increment & decrement concept");
        int a = 10;
        System.out.println(--a + a-- + a--); //(9)9 + 9(8) + 8(7) = 9+9+8 = 26
        System.out.println(a); //a= 7

        int c = 10;
        System.out.println(--c + c++ + c--); //(9)9 + 9(10) + 10(9) = 9+9+10 = 28
        System.out.println(c); //c=9

        int d = 10;
        System.out.println(d-- + d-- + d--); //10(9) + 9(8) + 8(7) = 10+9+8 = 27
        System.out.println(d); //d = 7
    }
}
