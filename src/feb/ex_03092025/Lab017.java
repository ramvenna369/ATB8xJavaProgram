package feb.ex_03092025;

public class Lab017 {
    //Functions/Methods concept
    /*
    Parameter = Argument
    1. Without Parameter and without return type
    2. Without Parameter but with return type
    3. With Parameter but without return type
    4. With Parameter and with return type
     */

    public static void Add(){
        int a = 1, b = 2;
        System.out.println(a+b);
    }
    public static int Sub(){
        int a = 2, b =1;
        return a-b;
    }
    public static void Mult(int a, int b){
        System.out.println(a*b);
    }
    public static int Add2(int a, int b, int c){
        return a+b+c;
    }



    public static void main(String[] args) {
        Lab017.Add();
        int sub = Sub();
        System.out.println(sub);
        Lab017.Mult(2, 3);
        int sum = Add2(5, 5, 5);
        System.out.println(sum);
    }
}
