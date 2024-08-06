import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Acesso NEGADO.");
        } else {
            System.out.println("Acesso ACEITO");
        }
    }
}
