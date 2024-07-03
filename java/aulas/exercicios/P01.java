import java.util.Scanner;
import java.util.Random;

public class P01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("""
    Jogo de Adivinhação!!
    Voce tem 5 tentativas.
        """);

        int numeroRan = new Random().nextInt(100);

        System.out.print("Digite um número: ");
        int numeroAdv = ler.nextInt();

        for (int num = 1; num <= 5; num++) {
            while (numeroAdv != numeroRan) {
                System.out.print("Errou! Tente novamente: ");
                numeroAdv = ler.nextInt();
    
                if (numeroAdv < numeroRan) {
                    System.out.println("O numero é maior...");
                }
    
                if (numeroAdv > numeroRan) {
                    System.out.println("O numero é menor...");
                }

                
            }
        }        

        System.out.println("FIM.");
        ler.close();
    }
}
