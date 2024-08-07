import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 10;
        double somaNotas = 0;

        System.out.println("Informe as notas dos " + totalAlunos + "alunos:");

        for (int num = 1; num <= totalAlunos; num++) {
            System.out.println("Nota do estudante " + num + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double mediaSala = somaNotas / totalAlunos;
        System.out.println("\nA média das notas da sala é: " + mediaSala);

        scanner.close();
    }
}
