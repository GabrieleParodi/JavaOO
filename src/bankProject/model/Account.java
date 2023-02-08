package bankProject.model;

import java.time.LocalDate;

public class Account{
    protected double balance;
    private final LocalDate openDate;
    private String client;
    public Account(){
        this(1000,LocalDate.now(),"Anonimo");
        /*balance = 1000;
        openDate = LocalDate.now();
        client = "Anonimo";*/
    }
    public Account(double b, LocalDate ld, String clientName){
        balance = b;
        openDate = ld;
        client = clientName;
    }
    public Account(double c, LocalDate locDate){
        this(c, locDate, "Anonimo");
        /*balance = c;
        openDate = locDate;
        client = "Anonimo";*/
    }

   public double getBalance() { //incapsulamento, legge
        //return balance;
       return balance/100;
    }

    public void setBalance(double amount) { //incapsulamento, scrive
        //this.amount = amount;
        if(amount >= 0){
            this.balance = amount*100;
        }
    }

    public LocalDate getOpenDate(){
        return openDate;
    }

    public String getClient(){
        return client;
    }

    public void setClient(String c){
        client = c;
    }
    public double deposit(double amount){
        //amount *= 100;
        this.balance += amount;
        return balance;
    }
    //metodo Overloading
    public double deposit(double amount, double extra){
        balance += amount;
        balance += extra/2;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
}