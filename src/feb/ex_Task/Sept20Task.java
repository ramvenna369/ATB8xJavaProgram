package feb.ex_Task;

public class Sept20Task {
    public static void main(String[] args) {
        int a= 10, b=20, c = 45, max1, max2;
        //Ternary Operator
        System.out.println("Answer 1");
        //Syntax: result = (condition) ? true : false
        max1 = (a>b) ? a : b; //result = (10 > 20) ? 10  : 20
        //res = condition ? if true print 10 : if false print 20
        //System.out.println(max1); //20
        max2 = (max1>c) ? max1 : c;
        System.out.println(max2);

        //another way to compare 3 values is shown below using ternary operator
        System.out.println("Answer 2");
        int score = 85;
        String grade;
        grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println(grade);

        //if - else Condition Concept
        System.out.println("Answer 3");
        int side1 = 10, side2 = 16, side3= 10;
        if (side1 == side2){
            if (side1 == side3){
            System.out.println("Equilateral");
        } else {
            System.out.println("Isosceles");
        }} else if (side2 == side3) {
            System.out.println("Isosceles");
        } else if (side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
        System.out.println("Answer 5, 4 in next class");
        //if else condition
        short year = 2024;
        if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not leap year");
        }

    }
}
