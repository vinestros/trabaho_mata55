package weapon;

public class Pistola extends Arma {

    public Pistola() {
        super("Pistola", 6);
    }

    @Override
    public String usar() {
        return "*BANG!* - O tiro ecoa pelo ambiente!";
    }

    @Override
    public String getTipo() {
        return "Arma de Fogo";
    }
}