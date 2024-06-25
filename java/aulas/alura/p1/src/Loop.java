import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            double mediaAvaliacao = 0;
            double nota = 0;
            
            for (int i = 0; i < 3; i++) {
                System.out.print("Diga a sua avaliação para o filme: ");
                nota = leitura.nextDouble();
                mediaAvaliacao += nota; 
            }
            
            System.out.println("A avaliação média é %.1f".formatted(mediaAvaliacao / 3));
        }
    }
}
