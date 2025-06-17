package enemy;

public class Infectado {
    protected String tipo;
    protected int pontosDeVida;
    protected int forca;
    protected int agilidade;
    protected int percepcao;

    public Infectado(String tipo, int pontosDeVida, int forca, int agilidade, int percepcao) {
        this.tipo = tipo;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.agilidade = agilidade;
        this.percepcao = percepcao;
    }

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
} 