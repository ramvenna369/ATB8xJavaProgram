package feb.ex_02292025;

public class Lab011 {
    public static void main(String[] args) {
        //Operators Concept
        // all topics not covered here, refer notes
        // here = is called assignment operator
        System.out.println("Assignment operator");
        /*
        data_type variable_name operator variable_value;
          int           a          =         10;
        can also be known as below
        data_type operand operator Literal
         */
        int a = 10;
        System.out.println("=");
        /*operator basically assigns right hand value(Literal/variable_value) to
         variable_name/operand
         */
        System.out.println("Arithmetic Operator");
        // +,-,/,*,% - modulus(gives remainder)
        short b = 2;
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("Unary Operator");
        int c = -1; //here '-' is unary operator
        int d = +30; // here + is unary operator but since it represents positive num, we can ignore
        //a + b, here + is unary operator
        String fname = "Ram";
        String lname = "Krishna";
        System.out.println(fname+lname); //here + is called concatenation, both are different

        System.out.println(a+b+fname+lname); //here first + will do math
        System.out.println(fname+lname+a+b); //here first + will do concat, so a+b will also concat

        System.out.println("Compound Operator");
        // +=, -=, /=, *=
        short e = 20;
        e -= 10; //which means e = e-10 so answer is 10
        System.out.println(e);
        /*
        Just FYR topic
        int enum = 10;
        sout(enum); error because enum is keyword & can't use as operand. ENUM, Enum we can use.
         */
        System.out.println("Relational operator");
        // >, <, >=, <=, ==, != --> gives boolean answer like true or false
        boolean f = e > b ; //answer true becz e is 10, b is 2
        System.out.println(f);



    }
}
