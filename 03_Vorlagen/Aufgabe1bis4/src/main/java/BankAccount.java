public class BankAccount {

    private final long accountnr;
    private final BankCustomer customer;
     private double balance;

    public BankAccount(long accountnr, BankCustomer customer) {
        this.accountnr = accountnr;
        this.customer = customer;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

     public long getNumber() {
         return accountnr;
     }

    public BankCustomer getCustomer() {
        return customer;
    }

     public double getBalance() {
         return balance;
     }

     public BankManager getManager(){
        return customer.getManager();
     }

     public boolean sameCustomer(BankAccount other){
        return customer.equals(other.customer);
     }

    public void print() {
        System.out.println("Account " + accountnr + " balance " + balance);
    }
}


