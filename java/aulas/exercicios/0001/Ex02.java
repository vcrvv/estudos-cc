import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora!");
        System.out.println("Por Favor, escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();
        System.out.println("Digite dois números: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double resultado = 0;

        switch (escolha) {
            case 1:
                System.out.println("Resultado da SOMA:" + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado da SUBTRAÇÃO: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da MULTIPLICAÇÃO: " + num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da DIVISÃO: " + num1 / num2);
                } else {
                    System.out.println("Não é possivel dividir por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");

        }

    }
}
