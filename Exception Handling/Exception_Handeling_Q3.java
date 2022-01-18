class SavingAccount
{
    private long id;
    private double balance;

    double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if(amount> getBalance()){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        if (amount<0) {
            throw new IllegalBankTransactionException("Illegal Bank Transaction");
        }
        setBalance(getBalance() - amount);

        System.out.println("withdraw successful with remaining balance "+balance);
        return getBalance();
    }

    double deposit(double amount){
        setBalance(getBalance() + amount);
        return getBalance();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

class IllegalBankTransactionException extends RuntimeException {
    public IllegalBankTransactionException(String msg) {
        super(msg);
    }
}

public class Exception_Handeling_Q3 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setBalance(2000);
        savingAccount.withdraw(4000);
    }
}