public class Main {
    public static void main(String[] args) {
        BankManager managerSmith = new BankManager("Kate Smith", 1);

        BankCustomer cutomerKlaraMeier = new BankCustomer(managerSmith,
                "Klara", "Meier", "Oberseestr. 10", 29);
        BankCustomer cutomerPetraMueller = new BankCustomer(managerSmith,
                "Petra", "Müller", "Oberseestr. 11", 30);

        BankAccount account1 = cutomerKlaraMeier.openNewAccount(1);
        BankAccount account2 = cutomerKlaraMeier.openNewAccount(2);
        BankAccount account3 = cutomerPetraMueller.openNewAccount(3);

        account1.deposit(12000);
        account2.deposit(1000);
        account3.deposit(5000);

        account1.print();
        account2.print();
        account3.print();

        boolean sameCustomerCallResult1 = account1.sameCustomer(account2);
        String sameCustomerCallName1 = "account1.sameCustomer(account2): ";
        System.out.println(sameCustomerCallName1
                + Boolean.toString(sameCustomerCallResult1));

        boolean sameCustomerCallResult2 = account1.sameCustomer(account3);
        String sameCustomerCallName2 = "account1.sameCustomer(account3): ";
        System.out.println(sameCustomerCallName2
                + Boolean.toString(sameCustomerCallResult2));

        account3.getManager().print();
    }
}
