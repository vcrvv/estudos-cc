
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar participante");
            System.out.println("2. Verificar se um participante está registrado");
            System.out.println("3. Remover participante");
            System.out.println("4. Listar participantes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            String nome; // Variável para armazenar o nome do participante

            switch (opcao) {
                case 1: // Adicionar participante
                    System.out.print("Digite o nome do participante a ser adicionado: ");
                    nome = scanner.nextLine();
                    if (participantes.add(nome)) {
                        System.out.println(nome + " adicionado com sucesso.");
                    } else {
                        System.out.println(nome + " já está registrado no evento.");
                    }
                    break;
                case 2: // Verificar participante
                    System.out.print("Digite o nome do participante a ser verificado: ");
                    nome = scanner.nextLine();
                    if (participantes.contains(nome)) {
                        System.out.println(nome + " está registrado no evento.");
                    } else {
                        System.out.println(nome + " não está registrado no evento.");
                    }
                    break;
                case 3: // Remover participante
                    System.out.print("Digite o nome do participante a ser removido: ");
                    nome = scanner.nextLine();
                    if (participantes.remove(nome)) {
                        System.out.println(nome + " removido com sucesso.");
                    } else {
                        System.out.println(nome + " não foi encontrado no registro do evento.");
                    }
                    break;
                case 4: // Listar participantes
                    System.out.println("Participantes Registrados:");
                    if (participantes.isEmpty()) {
                        System.out.println("Nenhum participante registrado.");
                    } else {
                        for (String participante : participantes) {
                            System.out.println("- " + participante);
                        }
                    }
                    break;
                case 0: // Sair
                    System.out.println("Saindo...");
                    scanner.close(); // Fechar o scanner antes de sair
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}