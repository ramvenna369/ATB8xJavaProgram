package feb.ex_Task;

public class TestCaseAPI extends BaseTestAPI{

    TestCaseAPI(){
        //super(); calling Parent DC
        System.out.println("Default Constructor");
    }
    TestCaseAPI(String name, int id){
        super(name, id);
        System.out.println("Calling name, id from Parent Class");
    }

    public int getId(){
        return super.getId();
    }
    public void setName(String name){
        this.setName(name);
    }
    void performGet(){
        System.out.println("Performing Get");
    }
    void performPost(){
        System.out.println("Performing Post");
    }
    void performPatch(){
        System.out.println("Performing Patch");
    }
    void performPut(){
        System.out.println("Performing Put");
    }
    void performDelete(){
        System.out.println("Performing Delete");
    }



}
