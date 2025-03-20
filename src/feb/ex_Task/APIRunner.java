package feb.ex_Task;

public class APIRunner {
    public static void main(String[] args) {

        //calling BasetestAPI DC
        new BaseTestAPI();
        BaseTestAPI base = new BaseTestAPI("Harry",1);
        System.out.println(base.getName());
        base.setName("Raj");
        System.out.println(base.getName());
        base.performGet();
        base.performPost();
        base.performPut();
        //calling TestAPI DC
        new TestCaseAPI();
        TestCaseAPI test = new TestCaseAPI("hello",8);
        System.out.println(test.getName());
        test.performGet();
        test.performDelete();
        //Dynamic Dispatch : a superclass reference can
        // point to subclass objects, enabling polymorphic behavior.
        BaseTestAPI test1 = new TestCaseAPI("Apple",6);
        test1.performPost();
        test1.performPatch();


    }
}
