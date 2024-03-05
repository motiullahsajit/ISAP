public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account();

        account.show();
        account.setAccNo(6643);        
        account.setTitle("Sajit");
        account.setBalance(10000);
        account.show();

        System.out.println("Deposit");
        account.deposit(2000);
        account.show();
        System.out.println("Withdraw");
        account.withdraw(300);
        account.show();

        System.out.println("Deposit________");
        Transaction t = new Transaction();
        t.setTransactionNo(1);
        t.deposit(account,1000);
        System.out.println(t);
        account.show();

        System.out.println("Withdraw________");
        Transaction t1 = new Transaction();
        t1.setTransactionNo(2);
        t1.withdraw(account,900);
        System.out.println(t1);
        account.show();


    }
}


// add tranfer functionality