package feb.ex_Task;

public class ATBStudent {
    //Class - ATBStudent

    //Attributes

    String name;
    char gender;
    float height;
    String DOB;
    long ph_num;


    //Behaviours

    void run(){
        System.out.println("Running");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    void work(){
        System.out.println("Working");
    }
    void details(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Height : "+height);
        System.out.println("DOB (MM/DD/YYYY): "+DOB);
        System.out.println("Contact num : "+ph_num);
    }
}
