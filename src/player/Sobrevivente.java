package player;

import enemy.Infectado;
import java.util.Random;

public class Sobrevivente {
    private int pontosDeVida = 100;
    private String nome;
    private int agilidade;
    private int forca;
    private int furtividade;
    private Random random = new Random();

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

    public void atacar(Infectado infectado) {
        if (forca == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getForca() / 10.0)) - (forca / 10.0);
            double varResultado = random.nextDouble();
            System.out.println(chanceFracasso);
            System.out.println(varResultado);
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu derrotar o " + infectado.getTipo() + "!");
            }
        }
    }

    public void correr(Infectado infectado) {
        if (agilidade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getAgilidade() / 10.0)) - (agilidade / 10.0);
            double varResultado = random.nextDouble();
            System.out.println(chanceFracasso);
            System.out.println(varResultado);
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu fugir do " + infectado.getTipo() + "!");
            }
        }
    }

    public void passarFurtivamente(Infectado infectado) {
        if (furtividade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " percebeu sua presença e te pegou!");
            pontosDeVida = 0;
        } else {
            double chanceFracasso = (0.6 + (infectado.getPercepcao() / 10.0)) - (furtividade / 10.0);
            double varResultado = random.nextDouble();
            System.out.println(chanceFracasso);
            System.out.println(varResultado);
            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " percebeu sua presença e te pegou!");
                pontosDeVida = 0;
            } else {
                System.out.println("Muito bom! Você conseguiu passar furtivamente do " + infectado.getTipo() + "!");
            }
        }
    }
} 