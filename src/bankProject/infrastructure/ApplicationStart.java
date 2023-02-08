package bankProject.infrastructure;

import bankProject.model.Account;
import bankProject.model.CaymanAccount;
import bankProject.model.special.SpecialAccount;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;

public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application");

        Account a1 = new Account();

       /* a1.balance = 100_000;
        System.out.println(a1.balance);
        a1.balance = -1_000_000;*/
        //System.out.println(a1.client);
        //System.out.println(a1.openDate);

        System.out.println(a1.deposit(1000));
        System.out.println(a1.withdraw(500));
        System.out.println(a1.deposit(1000,100));

        Account a2 = new Account(2500, LocalDate.of(2023, 1, 7), "Piero Rossi");
        CaymanAccount ca = new CaymanAccount();

        //System.out.println(ca.balance); usare metodo getter
        System.out.println(a1.getBalance());
        a1.setBalance(1000);
        System.out.println(a1.getBalance());
        ca.deposit(10000);
        ca.evadeTax();
        Account a3 = new CaymanAccount(100_000, LocalDate.now(), "Ric98", "cip");
        Account[] acs = new Account[10];

    }
    public static void handleAccounts(Account[] acs){
        for(int i = 0; i < acs.length; i++){
            if(acs[i].getBalance() > 1000){
                acs[i].withdraw(10);
            }
        }
    }
    public static void handleAccount(Account x){
        String clientName = x.getClient();
        if(clientName != null && clientName.length() > 10 && clientName.startsWith("sa")){
            x.deposit(10);
        }
    }
}
