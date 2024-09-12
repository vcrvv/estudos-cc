import java.io.*;
import java.util.Scanner;

public class GerenciadorListaDeCompras {
    public static void main(String[] args) {
        adicionarItem();
        exibirLista();
    }

    public static void adicionarItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um item para adicionar à lista de compras (ou digite 'sair' para finalizar):");
        String item = scanner.nextLine();
        while (!item.equalsIgnoreCase("sair")) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("listaDeCompras.txt", true))) {
                bw.write(item);
                bw.newLine();
                System.out.println("Item '" + item + "' adicionado com sucesso!");
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo.");
                e.printStackTrace();
            }
            System.out.println("\nDigite outro item (ou 'sair' para finalizar):");
            item = scanner.nextLine();
        }
    }
    
    public static void exibirLista() {
        System.out.println("\nLista de Compras:");
        try (BufferedReader br = new BufferedReader(new FileReader("listaDeCompras.txt"))) {
            String itemLido;
            while ((itemLido = br.readLine()) != null) {
                System.out.println("- " + itemLido);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}