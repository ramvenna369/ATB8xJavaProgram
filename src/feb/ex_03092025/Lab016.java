package feb.ex_03092025;

public class Lab016 {
    public static void main(String[] args) {
        //using for loop concept
        //print first 5 even numbers from 0 to 100
        System.out.println("Question 2");

        int count=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0 && count<5){
                System.out.println(i);
                count++;
            }
        }
    }
}
