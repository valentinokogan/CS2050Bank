package account;

public class CheckingAccount extends SavingsAccount {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance, balance);
    }

    @Override
    public void applyInterest() {
        
    }
}
