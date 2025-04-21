package feb.ex_Task;

public class PrintMyBook extends Book{

        PrintMyBook(String name, String author, float price){
            super(name, author, price);
        }

        @Override
        void getDetails () {
            System.out.println(name);
            System.out.println(author);
            System.out.println(price);
        }
}
