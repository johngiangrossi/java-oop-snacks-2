package ex_4;

public abstract class Figura {

    /*
    Consegna:
    Crea una classe astratta Figura con un metodo astratto calcolaArea().
    Crea sottoclassi Cerchio e Rettangolo.
    Usa una costante PI_GRECO dichiarata come public static final double PI_GRECO = 3.14.
    In Cerchio, usa PI_GRECO per calcolare l’area.
    Rendi Figura final e osserva cosa succede (errore se provi a estendere).
    Rendi un metodo final in Rettangolo e prova a sovrascriverlo (deve dare errore).
    */

    // metodi
    // metodo astratto calcola area
    public abstract double calculateArea();
    
}

