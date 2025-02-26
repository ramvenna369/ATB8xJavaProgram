package feb.ex_02272025;

public class Lab008 {
    public static void main(String[] args) {
        //Literals --> know as variable_value.
        //Literal Types -> Boolean, integral, character
        //int a = 100; here 100 is Literal
        //FYI, in selenium, we use Literal concept to store "color of a button"

        //Boolean Literal has two values - true, false
        //Integral Literal has following
        int binary_num = 0b1010; //1010 is binary code for 10 in our decimal system
        System.out.println("Integral Literal");
        System.out.println(binary_num);// so output will be 10
        // we have octa and hexa literal also

        //Char Literal -> Escape sequence and ASCII
        System.out.println("Escape Sequence");
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';
        System.out.println("1. Ram" + new_line + "1. Krishna");
        System.out.println("2. Ram" + tab_line + "2. Krishna");
        System.out.println("3. Ram" + back_space + "3. Krishna");
        System.out.println("4. Ram" + car_r + "4. Krishna"); //terminates the prior data
        System.out.println("5. Ram" + '\n' + "5. Krishna");



        System.out.println("ACII char ");
        char c1 = 'A'; //ASCII value of A is 65 //ASCII is american standard
        //Other countries introduced Unicode
        char c2 = '\u0041'; //\u0041 is the unicode value of A
        System.out.println(c2);
        //Null Literal
        //Null is also literal which supports only non primitive data types
        String s1= null;
       // int i = null; throws error

    }
}
