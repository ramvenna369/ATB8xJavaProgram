package feb.ex_Task;

    /*
  Class and Object
  1. Class and object are basic concepts of Object-Oriented Programming (OOPs)
     that are used to represent real-world concepts.
  2. Class is user defined datatype which has its own attributes and behaviors
  3. Class is a blueprint or template from which objects can be created
  4. class is declared once and called multiple times to create new objects
  5. objects are instance of class.
  6. 'new' keyword is used in java to create an object of any class
  7. No memory is allocated when a class is declared, but memory allocation happens when
  an object is created.
  8. A class is a logical entity, while an object is a physical entity.

  OOPs and features
  1. OOPs (object-oriented Programming)  is a methodology or paradigm to design a program using
     classes and objects, aims to represent real-world concepts
  2. Object-oriented programming aims to implement real-world entities and its features includes:
     - Classes and Objects
     - Inheritance
     - Polymorphism
     - Abstraction
     - Encapsulation

     */
    public class Oct02Task {
        public static void main(String[] args) {

            ATBStudent student1 = new ATBStudent();
            student1.name = "Ram";
            student1.height = 6.2f;
            student1.ph_num = 1231231231l;
            student1.gender = 'M';
            student1.DOB = "01/01/1947";
            student1.run();
            student1.details();

            ATBStudent student2 = new ATBStudent();
            student2.name = "Kavya";
            student2.height = 5.2f;
            student2.ph_num = 2222222222l;
            student2.gender = 'F';
            student2.DOB = "11/11/1919";
            student2.work();
            student2.details();

            ATBStudent student3 = new ATBStudent();
            student3.name = "Yogi";
            student3.height = 5.9f;
            student3.ph_num = 121212121l;
            student3.gender = 'M';
            student3.DOB = "01/01/2026";
            student3.run();
            student3.details();

            ATBStudent student5 = new ATBStudent();
            student5.name = "Mani";
            student5.height = 3.4f;
            student5.ph_num = 696979798l;
            student5.gender = 'M';
            student5.DOB = "02/14/1947";
            student5.sleep();
            student5.details();

            ATBStudent student4 = new ATBStudent();
            student4.name = "Siva";
            student4.height = 5.11f;
            student4.ph_num = 111111111l;
            student4.gender = 'M';
            student4.DOB = "01/01/1945";
            student4.sleep();
            student4.details();


        }

}
