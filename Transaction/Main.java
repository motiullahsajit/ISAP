public class Main {
    public static void main(String[] args){
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
    }
}
