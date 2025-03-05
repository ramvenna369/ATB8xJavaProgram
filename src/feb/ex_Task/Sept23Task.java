package feb.ex_Task;

public class Sept23Task {
    public static void main(String[] args) {
        //Switch case concept
        int n1 = 10, n2 = 5;
        String Operation ="Add";

        //switch (expression) {
        /*case statement 1:
         condition
         break;
         case statement 2:
         and so on}
         */
        System.out.println("Answer 1");
        switch (Operation) {
            case "Add":
                System.out.println(n1 + n2);
                break;
            case "Sub":
                System.out.println(n1 - n2);
                break;
            case "Mult":
                System.out.println(n1 * n2);
                break;
            case "Div":
                System.out.println(n1 / n2);
                break;
            case "Mod":
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Operation not found");
                break;
        }
        System.out.println("Answer 2");
        int month = 12;
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Wrong input");
        }
        System.out.println("Answer 3");
        String Convert = "Convert KM";
        float num = 90f; //km
                switch(Convert){
                    case "Convert KM":
                        System.out.println(num*1000+" in meters");
                        break;
                    case "Convert F":
                        System.out.println((num - 32)* 5/9 +" in celsius");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
    }
}
