package ex_2;

public class ContoBancario {

    /*
    Consegna:
    Crea una classe ContoBancario con i campi privati saldo e numeroConto.
    Crea metodi pubblici deposita(), preleva(), getSaldo().
    Crea una sottoclasse ContoRisparmio che aggiunge un tasso di interesse.
    Aggiungi un metodo applicaInteressi() che aumenta il saldo.
    Testa tutto nel main e spiega perché serve l’incapsulamento.
    */

    // fields
    private double balance;
    private String accountNumber;

    // costruttore
    public ContoBancario(double balance, String accountNumber) {
        if (balance < 0 || accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("hai inserito valori errati, inserisco quelli di default");
        } else {
            this.balance = balance;
            this.accountNumber = accountNumber;
        }
    }

    
    // getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    // setters
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("hai inserito valori errati, non cambio il valore");
        } else {
            this.balance = balance;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("hai inserito valori errati, non cambio il valore");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    // metodi
    // metodo depositare soldi
    public double deposit(double money) {
        if (money < 0) {
            System.out.println("non posso aggiungere soldi al conto, inserire un valore corretto");
            return balance;
        } else {
            balance += money;
            return balance;
        }
    }

    // metodo prelevare soldi
    public double withdraw(double money) {
        if (money < 0 || balance < money) {
            System.out.println("non puoi prelevare soldi al conto, inserire un valore corretto");
            return balance;
        } else {
            balance -= money;
            return balance;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContoBancario{");
        sb.append("balance=").append(balance);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append('}');
        return sb.toString();
    }

}
