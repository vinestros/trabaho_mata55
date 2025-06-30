package enemy;

/**
 * Classe que representa um infectado do tipo Baiacu.
 * Alta força e baixa agilidade.
 */
public class Baiacu extends Infectado {
    public Baiacu() {
        super("Baiacu", 100, 10, 2, 4);
    }

    @Override
    public String emitirSom() {
        return "GROOOAARRR! *rugido profundo e ameaçador*";
    }

    @Override
    public String getDescricaoAparencia() {
        return "Um infectado grande e musculoso, com aparência intimidadora e movimentos lentos";
    }
} 