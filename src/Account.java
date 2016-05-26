/**
 * Created by s180256 on 5/5/2016.
 */
public class Account {

    private double balance;
    private double maximumDebt = -200.0;

    public Account(){
        balance = 500;
    }

    /**
     *
     * This will withdraw money from your bank account and return true if successful or false if you have insufficient
     * funds
     *
     * @param money the amount of money you want to withdraw
     * @return true if it is successful or false if you have insufficient funds
     */

    public boolean withdraw(double money){
        if(balance - money > maximumDebt){
            balance -= money;
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * This will deposit money in to your bank account
     *
     * @param money the amount of money you want to deposit in your bank account
     */

    public void deposit(double money){
        balance += money;
    }

    /**
     *
     * Returns the amount of money in your bank account
     *
     * @return the amount of money in your bank account
     */

    public double getBalance(){
        return balance;
    }

}
