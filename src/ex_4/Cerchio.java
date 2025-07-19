package ex_4;

public class Cerchio extends Figura {

    // fields
    private double radius;
    public static final double PI_GRECO = 3.14;  

    // costruttore
    public Cerchio(double radius) {
        this.radius = radius;
    }

    // metodi
    // calcola area
    @Override
    public double calculateArea() {
        return PI_GRECO * Math.pow(radius, 2);
    }

    // stampo area
    public void stampArea() {
        System.out.println("area del cerchio è: " + calculateArea());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cerchio{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    // getters
    public double getRadius() {
        return radius;
    }

    // setters
    public void setRadius(double radius) {
        this.radius = radius;
    }



    


    
    

}
