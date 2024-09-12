import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Map<Integer, String> catalogo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu do Catálogo de Produtos:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            int id;
            String nome;

            switch (opcao) {
                case 1: // Adicionar Produto
                    System.out.print("Digite o ID do produto: ");

                    id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Digite o nome do produto: ");
                    
                    nome = scanner.nextLine();

                    if (!catalogo.containsKey(id)) {
                        catalogo.put(id, nome);
                        System.out.println("Produto adicionado com sucesso.");
                    } else {
                        System.out.println("Id já registrado ");
                        } 
                    break;
                case 2: // Remover Produto
                    System.out.print("Digite o ID do produto a ser removido: ");
                    id = scanner.nextInt();
                    if (catalogo.remove(id) != null) {
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3: // Atualizar Produto
                    System.out.print("Digite o ID do produto a ser atualizado: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Digite o novo nome do produto: ");
                    nome = scanner.nextLine();
                    if (catalogo.containsKey(id)) {
                        catalogo.put(id, nome);
                        System.out.println("Produto atualizado com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4: // Listar Produtos
                    System.out.println("Lista de Produtos:");
                    for (Map.Entry<Integer, String> produto : catalogo.entrySet()) {
                        System.out.println("ID: " + produto.getKey() + " - Nome: " + produto.getValue());
                    }
                    break;
                case 0: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}