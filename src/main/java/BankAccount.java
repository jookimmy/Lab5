import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Workplace account.
         */
        WORKPLACE
    }

    /**
     * Unique account number for each BankAccount instance.
     */
    private int accountNumber;
    /**
     * Unique accounttype for each instance.
     */
    private BankAccountType accountType;
    /**
     * Unique account balance.
     */
    private double accountBalance;
    /**
     * Unique owner name.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * Unique amount earned from interest for each instance.
     */
    private double interestEarned;

    /**
     * BankAccount constructor.
     * @param name Name of owner
     * @param accountCategory account type for bank
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
            this.ownerName = name;
            this.accountType = accountCategory;
    }

    /**
     * Getter for account number.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for account number.
     * @param newAccountNumber int to set
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    /**
     * Getter for account balance.
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Setter for account balance.
     * @param newAccountBalance double account balance
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(final double newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }
}