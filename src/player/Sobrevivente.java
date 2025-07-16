package player;

import enemy.Infectado;
import weapon.Arma;
import java.util.Random;

/**
 * Classe que representa o jogador sobrevivente no jogo.
 * Possui atributos de agilidade, força e furtividade que determinam suas
 * chances de sucesso.
 */
public class Sobrevivente {
    private boolean vivo = true;
    private String nome;
    private int agilidade;
    private int forca;
    private int furtividade;
    private Arma armaEquipada;
    private Random random = new Random();

    /**
     * Construtor da classe Sobrevivente
     * 
     * @param nome        Nome do sobrevivente
     * @param agilidade   Pontos de agilidade (0-20)
     * @param forca       Pontos de força (0-20)
     * @param furtividade Pontos de furtividade (0-20)
     * @throws IllegalArgumentException se a soma dos atributos for maior que 20
     */
    public Sobrevivente(String nome, int agilidade, int forca, int furtividade) {
        if (agilidade + forca + furtividade > 20) {
            throw new IllegalArgumentException(
                    "Não foi possível criar o sobrevivente. Distribuição de pontos de habilidade deve totalizar 20.");
        }
        this.nome = nome;
        this.agilidade = agilidade;
        this.forca = forca;
        this.furtividade = furtividade;
    }

    public boolean estaVivo() {
        return vivo;
    }

    /**
     * Equipa uma arma no sobrevivente
     * 
     * @param arma A arma a ser equipada
     */
    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
        this.forca += arma.getDano();
        System.out.println("Você equipou: " + arma.getNome() + " e ganhou +" + arma.getDano() + " de força.");
    }

    /**
     * Retorna a arma equipada
     * 
     * @return A arma equipada ou null se não houver
     */
    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    /**
     * Tenta atacar um infectado baseado na força do sobrevivente
     * 
     * @param infectado O infectado a ser atacado
     */
    public void atacar(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());

        if (forca == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
            vivo = false;
        } else {
            double chanceFracasso = (0.6 + (infectado.getForca() / 10.0)) - (forca / 10.0);
            chanceFracasso = Math.max(0.1, Math.min(0.95, chanceFracasso)); // Limita a chance entre 10% e 95%
            double varResultado = random.nextDouble();

            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais forte do que você e te pegou!");
                vivo = false;
            } else {
                System.out.println("Muito bom! Você conseguiu derrotar o " + infectado.getTipo() + "!");
            }
        }
    }

    /**
     * Tenta correr de um infectado baseado na agilidade do sobrevivente
     * 
     * @param infectado O infectado do qual fugir
     */
    public void correr(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());

        if (agilidade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
            vivo = false;
        } else {
            double chanceFracasso = (0.6 + (infectado.getAgilidade() / 10.0)) - (agilidade / 10.0);
            double varResultado = random.nextDouble();

            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " foi mais rápido do que você e te pegou!");
                vivo = false;
            } else {
                System.out.println("Muito bom! Você conseguiu fugir do " + infectado.getTipo() + "!");
            }
        }
    }

    /**
     * Tenta passar furtivamente por um infectado baseado na furtividade do
     * sobrevivente
     * 
     * @param infectado O infectado a ser evitado
     */
    public void passarFurtivamente(Infectado infectado) {
        System.out.println("\n" + infectado.getDescricaoAparencia());
        System.out.println("Você ouve: " + infectado.emitirSom());

        if (furtividade == 0) {
            System.out.println("\nO " + infectado.getTipo() + " percebeu sua presença e te pegou!");
            vivo = false;
        } else {
            double chanceFracasso = (0.6 + (infectado.getPercepcao() / 10.0)) - (furtividade / 10.0);
            double varResultado = random.nextDouble();

            if (varResultado < chanceFracasso) {
                System.out.println("O " + infectado.getTipo() + " percebeu sua presença e te pegou!");
                vivo = false;
            } else {
                System.out.println("Muito bom! Você conseguiu passar furtivamente do " + infectado.getTipo() + "!");
            }
        }
    }

    public void vasculharAmbiente(Random random) {
        System.out.println("\nVocê começou a vasculhar o ambiente...");
        System.out.println("Procurando por itens úteis entre os destroços...");

        if (furtividade < 3) {
            System.out.println("Você fez muito barulho ao se mover pelos escombros...");
            System.out.println("Sua falta de furtividade chamou atenção de um infectado!");
            System.out.println("Ele te pegou de surpresa!");
            vivo = false;
            return;
        }

        boolean encontrouAlgo = random.nextBoolean();

        if (encontrouAlgo) {
            double probabilidadeArma = random.nextDouble();

            if (probabilidadeArma <= 0.7) {
                weapon.Faca facaEncontrada = new weapon.Faca();
                System.out.println("Sorte! Você encontrou uma " + facaEncontrada.getNome() + "!");
                equiparArma(facaEncontrada);
            } else {
                weapon.Pistola pistolaEncontrada = new weapon.Pistola();
                System.out.println("Uau! Você encontrou uma " + pistolaEncontrada.getNome() + "!");
                equiparArma(pistolaEncontrada);
            }
        } else {
            System.out.println("Você vasculhou cuidadosamente, mas não encontrou nada útil...");
            System.out.println("Terá que se virar apenas com suas habilidades!");
        }
    }
}