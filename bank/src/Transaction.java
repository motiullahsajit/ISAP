import java.util.Date;

public class Transaction {
    private int transactionNo;
    private String type;
    private Date date;
    private double amount;
    private Account account;


    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public int getTransactionNo() {
        return transactionNo;
    }
    public void setTransactionNo(int transactionNo) {
        this.transactionNo = transactionNo;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit (Account account, double amount) {
        setType("Deposit ");
        setAmount(amount);
        setDate(new Date());
        account.deposit(amount);
        setAccount(account);
        getAccount().getTransactions().add(this);        
    }

    public void withdraw (Account account, double amount) {
        setType("Withdraw ");
        setAmount(amount);
        setDate(new Date());
        account.withdraw(amount);
        setAccount(account);
        getAccount().getTransactions().add(this);           
    }
    @Override
    public String toString() {
        return "Transaction [transactionNo=" + transactionNo + ", type=" + type + ", date=" + date + ", amount="
                + amount + "]";
    }


}
