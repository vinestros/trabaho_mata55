package enemy;

/**
 * classe abstrata infectado
 * Define as características básicas que todos os tipos de infectados devem ter.
 */
public abstract class Infectado {
    protected String tipo;
    protected int pontosDeVida;
    protected int forca;
    protected int agilidade;
    protected int percepcao;

    /**
     * Construtor da classe Infectado
     * @param tipo tipo de infectado
     * @param pontosDeVida Pontos de vida do infectado
     * @param forca Nível de força do infectado
     * @param agilidade Nível de agilidade do infectado
     * @param percepcao Nível de percepção do infectado
     */
    public Infectado(String tipo, int pontosDeVida, int forca, int agilidade, int percepcao) {
        this.tipo = tipo;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.agilidade = agilidade;
        this.percepcao = percepcao;
    }

    // Métodos getters
    public String getTipo() {
        return tipo;
    }
    
    public int getForca() {
        return forca;
    }
    
    public int getAgilidade() {
        return agilidade;
    }
    
    public int getPercepcao() {
        return percepcao;
    }

    /**
     * @return String representando o som emitido
     */
    public abstract String emitirSom();

    /**
     * @return String com a descrição visual do infectado
     */
    public abstract String getDescricaoAparencia();
} 