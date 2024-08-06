import java.util.Random;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vinde ao Jogo de Adivinhação!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número secreto entre 1 e 10.");

        do {
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabens! Voce acertou o número secreto: ");
            } else {
                System.out.println("Ops! Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Voce acertou em " + tentativas + " tentativas!");
        scanner.close();
    }
}
