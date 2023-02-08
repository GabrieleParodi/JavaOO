package bankProject.model;

import java.time.LocalDate;

public class CaymanAccount extends Account{
    private String secretCode;
    public CaymanAccount(){
        super();
    }
    public CaymanAccount(double balance, LocalDate openDate, String clientName, String secretCode){
        super(balance, openDate, clientName);
        this.secretCode = secretCode;

    }
    public double evadeTax(){
        balance += 1000;
        deposit(1000);
        return balance;
    }
}
