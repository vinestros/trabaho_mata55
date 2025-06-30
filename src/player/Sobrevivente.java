package player;

import enemy.Infectado;
import java.util.Random;

/**
 * Classe que representa o jogador sobrevivente no jogo.
 * Possui atributos de agilidade, força e furtividade que determinam suas chances de sucesso.
 */
public class Sobrevivente {
    private int pontosDeVida = 100;
    private String nome;
    private int agilidade;
    private int forca;
    private int furtividade;
    private Random random = new Random();

    /**
     * Construtor da classe Sobrevivente
     * @param nome Nome do sobrevivente
     * @param agilidade Pontos de agilidade (0-20)
     * @param forca Pontos de força (0-20)
     * @param furtividade Pontos de furtividade (0-20)
     * @throws IllegalArgumentException se a soma dos atributos for maior que 20
     */
    public Sobrevivente(String nome, int agilidade, int forca, int furtividade) {
        if (agilidade + forca + furtividade > 20) {
            throw new IllegalArgumentException("Não foi possível criar o sobrevivente. Distribuição de pontos de habilidade deve totalizar 20.");
        }
        this.nome = nome;
        this.agilidade = agilidade;
        this.forca = forca;
        this.furtividade = furtividade;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    /**
     * Tenta atacar um infectado baseado na força do sobrevivente
     * @param infectado O infectado a ser atacado
     */
    public void atacar(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());
        
        if (forca == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getForca() / 10.0)) - (forca / 10.0);
            double varResultado = random.nextDouble();
            
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu derrotar o " + infectado.getTipo() + "!");
            }
        }
    }

    /**
     * Tenta correr de um infectado baseado na agilidade do sobrevivente
     * @param infectado O infectado do qual fugir
     */
    public void correr(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());
        
        if (agilidade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getAgilidade() / 10.0)) - (agilidade / 10.0);
            double varResultado = random.nextDouble();
            
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu fugir do " + infectado.getTipo() + "!");
            }
        }
    }

    /**
     * Tenta passar furtivamente por um infectado baseado na furtividade do sobrevivente
     * @param infectado O infectado a ser evitado
     */
    public void passarFurtivamente(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());
        
        if (furtividade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " percebeu sua presença e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getPercepcao() / 10.0)) - (furtividade / 10.0);
            double varResultado = random.nextDouble();
            
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " percebeu sua presença e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu passar furtivamente do " + infectado.getTipo() + "!");
            }
        }
    }
} 