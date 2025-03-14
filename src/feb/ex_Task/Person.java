package feb.ex_Task;

public class Person {

    // Attributes/Properties
    String full_name;
    String nick_name;
    char gender;
    float height;
    String colour;
    String native_location;
    long phone_number;
    String mother_tongue;
    String Qualification;
    String hobbies;

    public Person() {
        System.out.println("Default value");
    }

    //when you meet a stranger, this below parameterized constructor will be helpful
    Person(String nick_name) {
        System.out.println("nick name stored");
        this.nick_name = nick_name;
    }

    //for civil services, below parameterized constructor will be helpful
    Person(String full_name, char gender, float height, String Qualification, long phone_number) {
        this.full_name = full_name;
        this.gender = gender;
        this.height = height;
        this.Qualification = Qualification;
        this.phone_number = phone_number;
        System.out.println("for civil service purpose. name, gender,height ,qual, ph num stored");
    }

    // below parameterized constructor will be helpful for online friends
    Person(String full_name, String nick_name, char gender, String native_location, String mother_tongue) {
        this.full_name = full_name;
        this.nick_name = nick_name;
        this.gender = gender;
        this.native_location = native_location;
        this.mother_tongue = mother_tongue;
        System.out.println("for online profiles. full name, nick name, gender, location, language stored");
    }

    //below Constructor has all attributes/properties
    Person(String full_name, String nick_name, char gender, float height, String colour,
           String native_location, long phone_number, String mother_tongue, String Qualification,
           String hobbies) {
        this.full_name = full_name;
        this.nick_name = nick_name;
        this.gender = gender;
        this.height = height;
        this.colour = colour;
        this.native_location = native_location;
        this.phone_number = phone_number;
        this.mother_tongue = mother_tongue;
        this.Qualification = Qualification;
        this.hobbies = hobbies;
        System.out.println("all attributes stored");
    }


    // Behaviour/Methods
    void Eat() {
        System.out.println("Eating");

    }

    void Sleep() {
        System.out.println("Sleeping");

    }

    void Work() {
        System.out.println("Working");
    }

    void Unload() {
        System.out.println("Unloading");

    }

    void Laugh() {
        System.out.println("Laughing");

    }
}

