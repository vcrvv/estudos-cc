import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class GerenciadorDeFotos {

    private static final String DIRETORIO_FOTOS = "Fotos";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Path diretorioFotos = Paths.get(DIRETORIO_FOTOS);
            if (Files.notExists(diretorioFotos)) {
                Files.createDirectory(diretorioFotos);
            }

            int opcao;
            do {
                System.out.println("\nGerenciador de Fotos:");
                System.out.println("1. Listar Fotos");
                System.out.println("2. Copiar Foto");
                System.out.println("3. Excluir Foto");
                System.out.println("4. Visualizar Informações");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        listarFotos(diretorioFotos);
                        break;
                    case 2:
                        copiarFoto(diretorioFotos);
                        break;
                    case 3:
                        excluirFoto(diretorioFotos);
                        break;
                    case 4:
                        visualizarInformacoes(diretorioFotos);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 5);
        } catch (IOException e) {
            System.err.println("Erro ao acessar o diretório de fotos.");
            e.printStackTrace();
        }
    }

    private static void listarFotos(Path diretorio) throws IOException {
        System.out.println("Fotos:");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)) {
            for (Path arquivo : stream) {
                if (!Files.isDirectory(arquivo)) {
                    System.out.println(arquivo.getFileName());
                }
            }
        }
    }

    private static void copiarFoto(Path diretorio) throws IOException {
        System.out.print("Nome da foto para copiar: ");
        Path fotoOriginal = diretorio.resolve(scanner.nextLine());

        System.out.print("Diretório de destino: ");
        Path destino = Paths.get(scanner.nextLine());
        if (Files.notExists(destino)) {
            Files.createDirectories(destino);
        }

        Path fotoDestino = destino.resolve(fotoOriginal.getFileName());
        Files.copy(fotoOriginal, fotoDestino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Foto copiada com sucesso.");
    }

    private static void excluirFoto(Path diretorio) throws IOException {
        System.out.print("Nome da foto a ser excluída: ");
        Path foto = diretorio.resolve(scanner.nextLine());

        Files.deleteIfExists(foto);
        System.out.println("Foto excluída com sucesso.");
    }

    private static void visualizarInformacoes(Path diretorio) throws IOException {
        System.out.print("Nome da foto para visualizar informações: ");
        Path foto = diretorio.resolve(scanner.nextLine());

        BasicFileAttributes attrs = Files.readAttributes(foto, BasicFileAttributes.class);
        System.out.println("Informações da foto:");
        System.out.println("Tamanho: " + attrs.size() + " bytes");
        System.out.println("Data de criação: " + attrs.creationTime());
        System.out.println("Última modificação: " + attrs.lastModifiedTime());
        System.out.println("Caminho: " + foto.toAbsolutePath());
    }
}