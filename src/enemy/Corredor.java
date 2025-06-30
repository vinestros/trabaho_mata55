package enemy;

/**
 * Classe que representa um infectado do tipo Corredor.
 * Alta agilidade e baixa força.
 */
public class Corredor extends Infectado {
    public Corredor() {
        super("Corredor", 100, 0, 10, 7);
    }

    @Override
    public String emitirSom() {
        return "ARRRGHHHH! *som de passos rápidos*";
    }

    @Override
    public String getDescricaoAparencia() {
        return "Um infectado magro e ágil, com músculos das pernas bem desenvolvidos";
    }
} 