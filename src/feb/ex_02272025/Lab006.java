package feb.ex_02272025;

public class Lab006 {
    public static void main(String[] args) {
        /*
        String formatting  - use printf
        %d -> for integer. data types like byte, int, short, long
        %s -> string
        %c -> char
        %f -> float, double
         */
        /* Write 10 table using printf in below format - Practice TASK 1
        10 X 1 = 10
        10 X 2 = 20
        .
        .
        10 X 10 = 100
         */
        byte table_num = 10;
        System.out.printf("%d X %d = %d",table_num,1,table_num*1);//use printf
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,2,table_num*2);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,3,table_num*3);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,4,table_num*4);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,5,table_num*5);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,6,table_num*6);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,7,table_num*7);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,8,table_num*8);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,9,table_num*9);
        System.out.println(); //to move to next line
        System.out.printf("%d X %d = %d",table_num,10,table_num*10);
        System.out.println(); //to move to next line
    }
}
