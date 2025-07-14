package weapon;

public class Faca extends Arma {
    
    public Faca() {
        super("Faca", 15);
    }

    @Override
    public String usar() {
        return "*CORTE* - Você desfere um golpe certeiro com a faca!";
    }

    @Override
    public String getTipo() {
        return "Arma Branca";
    }
}