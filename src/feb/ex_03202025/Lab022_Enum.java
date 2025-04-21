package feb.ex_03202025;

public class Lab022_Enum {

    public static void main(String[] args) {

        /*
        enum colour{

            Red("#FF0000"),
            Black("#000000"),
            Yellow("FFFF00");

            private String hexcode;

            colour(String hexcode) {
                this.hexcode = hexcode;

            }
        }
        System.out.println(colour.Red);

        */

        enum name {
            Ram("Male"),
            Kajal("Female"),
            Mahesh("Male"),
            Rakul("Female");
            // gave close bracket here, throws error
            private String gender;

            name(String gender) {
                this.gender = gender;
            }
        } //enum is like Class, close bracket at end

        System.out.println(name.Rakul.gender);

    }
}
