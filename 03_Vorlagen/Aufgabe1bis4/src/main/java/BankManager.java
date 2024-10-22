public class BankManager {
    private final String name;
    private final int id;

    BankManager(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getManagerId() {
        return id;
    }

    public void print(){
        System.out.println("japppa jappa");
    }

}
