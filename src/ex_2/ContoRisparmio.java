package ex_2;

public class ContoRisparmio extends ContoBancario {

    
    // fields
    private double taxInterest;
    
    // costruttore
    public ContoRisparmio(double balance, String accountNumber, double taxInterest) {
        super(balance, accountNumber);
        if (taxInterest < 0) {
            System.out.println("hai inserito un valore errato, metto quello di default");
        } else {
            this.taxInterest = taxInterest;
        }
    }

    // getters
    public double getTaxInterest() {
        return taxInterest;
    }

    // setters
    public void setTaxInterest(double taxInterest) {
        if (taxInterest < 0) {
            System.out.println("hai inserito un valore errato, metto quello di default");
        } else {
            this.taxInterest = taxInterest;
        }
    }

    // metodi
    // calcolo tasso interesse
    private double calculateTaxInterest() {
        return getBalance() * taxInterest;
    }
    
    // applico interessi
    public double applyTaxInterest() {
        return deposit(calculateTaxInterest());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContoRisparmio{");
        sb.append("balance=").append(getBalance());
        sb.append(", accountNumber=").append(getAccountNumber());
        sb.append(", taxInterest=").append(taxInterest);
        sb.append('}');
        return sb.toString();
    }

}
