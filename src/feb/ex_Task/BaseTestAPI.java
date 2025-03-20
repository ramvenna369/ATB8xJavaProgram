package feb.ex_Task;

public class BaseTestAPI {

    private String name;
    private int id;

    BaseTestAPI(){

    }

    BaseTestAPI(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
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
