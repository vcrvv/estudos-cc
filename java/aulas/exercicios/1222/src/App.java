public class App {
  public static void main(String[] args) {
      // Notas do aluno, cada elemento representa uma disciplina
      double[] notasAluno = {7.5, 8.0, 9.0, 6.5, 8.0};

      // Calculando a média das notas
      double somaNotas = 0;
      for (int i = 0; i < notasAluno.length ; i++){
          somaNotas += notasAluno[i];
      }
      double media = somaNotas / notasAluno.length;

      // Imprimindo a média e determinando a situação do aluno
      System.out.println("Média do aluno: " + media);
      if(media >= 7.0) {
          System.out.println("Aluno aprovado!");
      } else {
          System.out.println("Aluno reprovado.");
      }
  }
}