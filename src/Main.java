//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import player.Sobrevivente;
import enemy.Corredor;
import enemy.Estalador;
import enemy.Baiacu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Corredor corredor1 = new Corredor();
        Estalador estalador1 = new Estalador();
        Baiacu baiacu1 = new Baiacu();
        Sobrevivente sobrevivente;

        System.out.println();
        System.out.print("Digite seu nome: ");
        String nomeSobrevivente = scanner.nextLine();

        System.out.println("\nOlá, " + nomeSobrevivente + "! ");
        System.out.println("Você agora é um sobrevivente preso dentro de um velho depósito com 3 infectados no seu caminho para a saída.");
        System.out.println("\nVocê possui 20 pontos de habilidades para distribuir entre os atributos: AGILIDADE, FORÇA e FURTIVIDADE. ");
        System.out.println("Escolha bem, pois não terá como refazer essa distribuição. ");
        System.out.println("Atente-se em não digitar uma soma total maior do que 20 pontos.\n");

        System.out.print("Digite o número de pontos em AGILIDADE: ");
        int agilidade = scanner.nextInt();
        System.out.print("Digite o número de pontos em FORÇA: ");
        int forca = scanner.nextInt();
        System.out.print("Digite o número de pontos em FURTIVIDADE: ");
        int furtividade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        try {
            sobrevivente = new Sobrevivente(nomeSobrevivente, agilidade, forca, furtividade);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String msgAcao2 = "Digite 1 para ATACAR, 2 para CORRER ou 3 para PASSAR FURTIVAMENTE.";

        while (sobrevivente.getPontosDeVida() > 0) {
            System.out.println();
            // Corredor
            System.out.println("Você se aproximou de um infectado Corredor... o que você vai fazer?");
            System.out.println();
            System.out.println(msgAcao2);
            int acao = scanner.nextInt();
            while (true) {
                if (acao == 1) {
                    sobrevivente.atacar(corredor1);
                    break;
                } else if (acao == 2) {
                    sobrevivente.correr(corredor1);
                    break;
                } else if (acao == 3) {
                    sobrevivente.passarFurtivamente(corredor1);
                    break;
                } else {
                    System.out.println("Comando inválido. " + msgAcao2);
                    acao = scanner.nextInt();
                }
            }
            if (sobrevivente.getPontosDeVida() == 0) {
                System.out.println("Você morreu! FIM DE JOGO");
                break;
            }
            // Estalador
            System.out.println();
            System.out.println("Você se aproximou de um infectado Estalador... o que você vai fazer?");
            System.out.println();
            System.out.println(msgAcao2);
            acao = scanner.nextInt();
            while (true) {
                if (acao == 1) {
                    sobrevivente.atacar(estalador1);
                    break;
                } else if (acao == 2) {
                    sobrevivente.correr(estalador1);
                    break;
                } else if (acao == 3) {
                    sobrevivente.passarFurtivamente(estalador1);
                    break;
                } else {
                    System.out.println("Comando inválido. " + msgAcao2);
                    acao = scanner.nextInt();
                }
            }
            if (sobrevivente.getPontosDeVida() == 0) {
                System.out.println("Você morreu! FIM DE JOGO");
                break;
            }
            // Baiacu
            System.out.println();
            System.out.println("Você se aproximou de um infectado Baiacu... o que você vai fazer?");
            System.out.println();
            System.out.println(msgAcao2);
            acao = scanner.nextInt();
            while (true) {
                if (acao == 1) {
                    sobrevivente.atacar(baiacu1);
                    break;
                } else if (acao == 2) {
                    sobrevivente.correr(baiacu1);
                    break;
                } else if (acao == 3) {
                    sobrevivente.passarFurtivamente(baiacu1);
                    break;
                } else {
                    System.out.println("Comando inválido. " + msgAcao2);
                    acao = scanner.nextInt();
                }
            }
            if (sobrevivente.getPontosDeVida() == 0) {
                System.out.println("Você morreu! FIM DE JOGO");
                break;
            } else {
                System.out.println();
                System.out.println("Ufa... Você conseguiu chegar vivo na saída! PARABÉNS!");
                System.out.println();
                System.out.println("FIM DE JOGO!");
                System.out.println();
                break;
            }
        }
        scanner.close();
    }
}