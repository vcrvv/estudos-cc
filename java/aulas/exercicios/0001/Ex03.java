import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo ao Café do Java!");
        System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande");
        String tamanho = leia.nextLine().toUpperCase();

        System.out.println("Escolha o tipo de café: (E) Expresso, (C) Cappuccino, (L) Latte");
        String tipoCafe = leia.nextLine().toUpperCase();

        double preco = 0;

        switch (tamanho) {
            case "P":
                preco += 2.50;
                break;
            case "M":
                preco += 3.00;
                break;
            case "G":
                preco += 3.50;
                break;
            default:
                System.out.println("Opção de tamanho inválida!");
                return;
        }

        switch (tipoCafe) {
            case "E":
                preco += 1.50;
                System.out.println("Café Expresso selecionado.");
                break;
            case "C":
                preco += 2.00;
                System.out.println("Café Cappuccino selecionado.");
                break;
            case "L":
                preco += 2.50;
                System.out.println("Café Latte selecionado.");
                break;
            default:
                System.out.println("Opção de café inválida!");
                return;
        }

        System.out.println("Seu pedido foi confirmado!");
        System.out.println("Total a pagar: R$" + preco);
    }
}