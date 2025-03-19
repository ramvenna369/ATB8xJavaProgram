package feb.ex_03192025;

import static java.awt.AWTEventMulticaster.add;

public class PolyAdd {

        //Polymorphism
        //Poly means Many, morph means forms
        public static int add (int a, int b){
            return a + b;
        }
        public static double add(double a, int b){
            return a + b;
        }
        public static String add(String a, String b){
            return a + b;
        }
    }
