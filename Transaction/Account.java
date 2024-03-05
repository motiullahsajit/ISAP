public class Account {
    private int accNo;
    private String title;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void show() {
        System.out.println("Account info ");
        System.out.println("---------------- ");
        System.out.println("Account No.: " + getAccNo());
        System.out.println("Account title: " + getTitle());
        System.out.println("Balance: " + getBalance());
    }

}