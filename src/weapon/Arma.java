package weapon;

/**
 * Classe abstrata que define as características básicas de todas as armas.
 * Define atributos comuns e métodos que devem ser implementados pelas armas específicas.
 */
public abstract class Arma {
    protected String nome;
    protected int dano;

    /**
     * Construtor da classe Arma
     * @param nome Nome da arma
     * @param dano Pontos de dano que a arma causa
     */
    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    // Métodos getters
    public String getNome() { return nome; }
    public int getDano() { return dano; }

    /**
     * Método abstrato que define como a arma é usada
     * @return String descrevendo o som/ação do uso da arma
     */
    public abstract String usar();

    /**
     * Método abstrato que retorna o tipo específico da arma
     * @return String com o tipo da arma
     */
    public abstract String getTipo();
}