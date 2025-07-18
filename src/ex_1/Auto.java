package ex_1;

public class Auto extends Veicolo {

    // fields
    private int numDoor;

    // costruttore
    public Auto(String brand, int year, int numDoor) {
        super(brand, year);
        if (numDoor < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.numDoor = numDoor;
        }
    }

    // getters
    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        if (numDoor < 0) {
            System.out.println("hai inserito valori errati, non modifico i valori");
        } else {
            this.numDoor = numDoor;
        }
    }

    // metodi
    // stampare info
    @Override
    public String stampInfo() {
        return "Auto [ brand= " + getBrand() + ", year= " + getYear() + ", numDoor= " + numDoor + " ]";
    }

    
}
