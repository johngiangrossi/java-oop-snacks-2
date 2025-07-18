package ex_1;

public class Veicolo {

    /*
    Consegna:
    Crea una classe Veicolo con i campi privati marca e anno.
    Crea una sottoclasse Auto con un campo aggiuntivo numeroPorte.
    Usa costruttori per inizializzare gli attributi.
    Fornisci metodi get e set per tutti i campi.
    Scrivi un metodo stampaInfo() in Veicolo, e sovrascrivilo in Auto
    */
    
    // fields
    private String brand;
    private int year;

    // costruttore
    public Veicolo(String brand, int year) {
        if (brand == null || brand.equals("") || year < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.brand = brand;
            this.year = year;
        }
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
    
    // setters
    public void setBrand(String brand) {
        if (brand == null || brand.equals("")) {
            System.out.println("hai inserito valori errati, non modifico i valori");
        } else {
            this.brand = brand;
        }
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("hai inserito valori errati, non modifico i valori");
        } else {
            this.year = year;
        }
    }
    
    // metodi
    // stampare info
    @Override
    public String stampInfo() {
        return "Veicolo [brand=" + brand + ", year=" + year + "]";
    }
}
