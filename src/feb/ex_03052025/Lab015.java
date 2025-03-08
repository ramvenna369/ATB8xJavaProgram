package feb.ex_03052025;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a word to count the vowels and consonants");
//        String name=sc.next();
        String name = "Pramod";
        int l=name.length();
        System.out.println(l);

        int vowel_count = 0, consonant_count = 0;
        for (int i = 0; i < 6; i++) {
            char c=name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'
            || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowel_count++;
            }
            else {
                consonant_count++;
            }
        }

        System.out.println("Num of vowels in Pramod = "+vowel_count);
        System.out.println("Num of consonants in Pramod = "+consonant_count);
    }
}
