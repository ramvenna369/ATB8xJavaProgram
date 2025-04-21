package feb.ex_Task;

public abstract class Book {

    public String name;
    String author;
    float price;

    Book(String name, String author, float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}


