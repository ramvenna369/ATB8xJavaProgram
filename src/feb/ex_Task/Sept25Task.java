package feb.ex_Task;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Sept25Task {
    public static void main(String[] args) {
        //for loop concept
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1");
        //10 * 1 = 10
        //10 * 2 = 20
        System.out.println("Enter a number for multiples");
        int table_num = sc.nextInt();
        for (int j=1;j<=10;j++){
            System.out.println(table_num+ " * "+j+" = "+table_num*j);
        }
        System.out.println("Question 2");

        System.out.println("Enter desired number for factorial");
        int fact_num = sc.nextInt();
        int temp = 1;
        for (int i = 1; i <= fact_num; i++){
            temp = temp*i;
        }
        System.out.println("Factorial of "+fact_num+" is "+temp);

        System.out.println("Question 3");
        System.out.println("Prime numbers from 1 to 100 are ");

        for (int i=1; i<= 100; i++){
            short count = 0;
            for (int j=1; j<=i; j++){
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
         }
        System.out.println('\n'+"Question 4");
        System.out.println("Enter a word/String. Only Alphabets");
        String name = sc.next();
        String s1 = name.toLowerCase();
        int vowel_count = 0, consonant_count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel_count++;
            }
            else {
                consonant_count++;
            }
        }
        System.out.println("Num of vowels in "+name+" = "+vowel_count);
        System.out.println("Num of consonants in "+name+" = "+consonant_count);
    }
}
