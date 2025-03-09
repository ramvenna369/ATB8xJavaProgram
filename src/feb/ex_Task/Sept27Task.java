package feb.ex_Task;

import java.util.Scanner;

public class Sept27Task {
    public static void main(String[] args) {
        System.out.println("Question 1"); // example for while VS do-while loop
        //if given condition is satisfied at least once, both while and do-while output
        // will be same.
        //if given condition is not satisfied, while loop won't return any output whereas
        // do-while will execute once.
        //basically do-while will execute atleast once even if the condition is not satisfied.
        //but if condition is satisfied, both while and do-while output will be same.
        int age = 17; //change age to 16 or condition to 18; while & do-while output will be same.
        while (age<17){
            System.out.println("Using while loop");
            System.out.println("Not eligible to vote"+age);
            age++;
        }
        int age2 = 17;
        do {
            System.out.println("Using do-while loop");
            System.out.println("No vote eligibility"+age2);
            age2++;
        }while (age2<17);

        System.out.println("Question 2");//print sum of numbers from 1 to 100 using while loop
        int count=0;
        int i=0;
        do {
            if (i%2==0) {
                System.out.println(i);
                count++;
            }
            i++;
        }while (count<5);
        System.out.println("Question 3");
        int sum=0;
        int j=1;
        while (j<=100){
            sum=sum+j;
            j++;
        }
        System.out.println(sum);
    }

}
