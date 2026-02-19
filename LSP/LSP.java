package SOLID.LSP;

import java.util.ArrayList;
import java.util.List;

public class LSP {
    public static void main(String[] args) {
        List<DepositOnlyAccount> deposits = new ArrayList<>();
        deposits.add(new FixedDeposit(1000));

        List<WithdrawalAccount> withdrawals = new ArrayList<>();
        withdrawals.add(new SavingsAccount(1000));
        withdrawals.add(new CustomerAccount(1000));

        BankClient client = new BankClient(deposits, withdrawals);
        client.processTransaction();
    }
}

class BankClient{
    private List<DepositOnlyAccount> deposits;
    private List<WithdrawalAccount> withdrawals;

    public BankClient(List<DepositOnlyAccount> deposits, List<WithdrawalAccount> withdrawals) {
        this.deposits = deposits;
        this.withdrawals = withdrawals;
    }

    public void processTransaction(){
        for(DepositOnlyAccount deposit: deposits){
            deposit.Deposit(1000);
        }
        for(WithdrawalAccount withdrawal: withdrawals){
            withdrawal.Deposit(1000);
            withdrawal.Withdraw(500);
        }
    }
}

abstract class DepositOnlyAccount{
    abstract public void Deposit(double amount);
}

abstract class WithdrawalAccount extends  DepositOnlyAccount{
    abstract public void Withdraw(double amount);
}

class SavingsAccount extends WithdrawalAccount{
    private double balance;
    public SavingsAccount(double balance){
        this.balance = balance;
    }
    @Override
    public void Withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Savings Account and New Balance: $" + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited $" + amount + " in Savings Account and New Balance is $" + balance);
    }
}

class CustomerAccount extends WithdrawalAccount{
    private double balance;

    public CustomerAccount(double balance){
        this.balance = balance;
    }

    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited $" + amount + " in Customer Account and New Balance is $" + balance);
    }

    public void Withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Customer Account and New Balance is $" + balance);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}

class FixedDeposit extends DepositOnlyAccount{
    private  double balance;
    public FixedDeposit(double balance){
        this.balance = balance;
    }

    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited $" + amount + " in Fixed Account and New Balance is $" + balance);
    }
}
