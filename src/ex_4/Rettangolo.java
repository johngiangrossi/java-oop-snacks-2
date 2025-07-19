package ex_4;

public class Rettangolo extends Figura {

    // fields
    private double base;
    private double height;

    // costruttore
    public Rettangolo(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.base = base;
            this.height = height;
        }
    }

    // metodi
    // calcola area
    @Override
    public final double calculateArea() {
        return base * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rettangolo{");
        sb.append("base=").append(base);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    // stampo area
    public void stampArea() {
        System.out.println("area del triangolo è: " + calculateArea()); 
    }

    // getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // setters
    public void setBase(double base) {
         if (base < 0) {
            System.out.println("hai inserito valori errati,non modifico il valore");
        } else {
            this.base = base;
        }
    }

    public void setHeight(double height) {
         if (height < 0) {
            System.out.println("hai inserito valori errati,non modifico il valore");
        } else {
            this.height = height;
        }
    }

    


}
