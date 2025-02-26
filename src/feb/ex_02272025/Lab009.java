package feb.ex_02272025;

public class Lab009 {
    public static void main(String[] args) {
        //CONSTANTS -> fixed variable values, whose values cannot be changed once they are assigned.
        //we use final keyword for CONSTANTS
        //Constant name will be in capital letters but when I tried with first cap and other small it worked.
        //Syntax:
        //final data_type CONSTANT_NAME=value;
        //final float PIE = 3.1456f; example 1
        //System.out.println(PIE);
        //example 2, where we give PIE first and then assign value which is possible
        final float PIE;
        PIE = 3.1456f; //this is possible because we are assigning first time
        //PIE = 1.2345f; now this will throw error because PIE has already assigned.
        //if you remove keyword final, then you can modify PIE value.
        System.out.println(PIE);
    }
}
