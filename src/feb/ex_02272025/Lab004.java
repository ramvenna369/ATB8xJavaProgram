package feb.ex_02272025;

public class Lab004 {
    public static void main(String[] args) {
        //Primitive Data Type concept - Boolean & Integral
        //Covering byte, short, int, char here
        //Syntax is
        //data_type variable_name = variable_value
        //Note: Java is CASE SENSITIVE
        //IMP Note: byte is data type. Byte is storage unit. 8 bits = 1 Byte
        byte b = 127; //8 bits, 1 Byte
        short s = 128; // 16 bits, 2 Byte
        int i = 1000; // 32 bits, 4 Byte
        long l = 9902323403l; //64 bits, 8 Byte.
        //Also we should use L/l after num for long data type.
        char c = 'A'; // 16 bits, 2 Byte. ASCII value which is numbers

        float f = 13.2f; //32 bits, 4 Byte. use f after num
        double d = 123.2323d; //64 bits, 8 Byte. use d after num

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }
}
