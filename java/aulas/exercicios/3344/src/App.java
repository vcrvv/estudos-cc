import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<String> linhas = Arrays.asList("Thiago Yamamoto", "Juliana Souza", "Matheus Araujo", "Maria Silva"); // Criar o arquivo
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt", true))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine(); // Adiciona uma quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("alunos.txt"); // Ler o arquivo
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e){
            System.err.println("Arquivo não encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}