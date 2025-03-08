package feb.ex_03052025;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num(range for prime number)");
        int prime_num= sc.nextInt();
        //Print prime num using for loop
        System.out.println("Prime numbers are");
        for (int i = 1; i<=prime_num; i++){
            short count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
        }
    }
}
