package enemy;

/**
 * Classe que representa um infectado do tipo Estalador.
 * Atributos equilibrados e alta percepção.
 */
public class Estalador extends Infectado {
    public Estalador() {
        super("Estalador", 100, 6, 6, 10);
    }

    @Override
    public String emitirSom() {
        return "*CLIQUE CLIQUE CLIQUE* - sons de estalos";
    }

    @Override
    public String getDescricaoAparencia() {
        return "Um infectado com características deformadas, emitindo sons de estalos constantemente";
    }
} 