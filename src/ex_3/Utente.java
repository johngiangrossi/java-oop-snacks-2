package ex_3;

public class Utente {

    /*
    Consegna:
    Crea una classe Utente con attributo nome.
    Aggiungi un attributo statico numeroUtenti che tiene il conto delle istanze create.
    In ogni costruttore, incrementa numeroUtenti.
    Crea un metodo statico getNumeroUtenti() che restituisce il totale.
    Nel main, crea 3 utenti e stampa il numero totale usando il metodo statico.
    */

    // fields
    private static int numUser = 0;

    // costruttore
    public Utente() {
        numUser++;
    }

    // getters
    public static int getNumUser() {
        return numUser;
    }

    
    // metodi
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Utente{");
        sb.append("numero utente: ").append(getNumUser());
        sb.append('}');
        return sb.toString();
    }
    
    
}
