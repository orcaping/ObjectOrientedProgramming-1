public class BankCustomer {

    private final BankManager manager;
    private final String firstname;
    private final String lastname;
    private final String address;
    private final int age;

    public BankCustomer(BankManager manager, String firstName, String lastName, String address, int age) {
        this.manager = manager;
        this.firstname = firstName;
        this.lastname = lastName;
        this.address = address;
        this.age = age;
    }
    public BankManager getManager() {
        return manager;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("Firstname " + firstname + " Lastname " + lastname);
    }

    public BankAccount openNewAccount(long number){
        return new BankAccount(number, this);
    }
}
