package feb.ex_Task;

public class Oct04Task {

    public static void main(String[] args) {

        Person DK = new Person();
        Person RamaKrishna = new Person("Ram");
        Person Aravind = new Person("Aravind", 'M', 5.8f, "B.Tech", 3123456789l); //got error when first digit started with 0
        Person Krishna = new Person("Rama Krishna", "Krishna", 'M', 5.10f, "Brown", "India", 1231231231l, "Telugu", "B.Tech", "Movies");
        Person Kavya = new Person("KavyaShree", "Kavya", 'F', "Andhra", "Telugu");

        DK.Work();
        String s1 = RamaKrishna.nick_name;
        System.out.println(s1);

    }
}
