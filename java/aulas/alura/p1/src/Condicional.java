public class Condicional {
    public static void main(String[] args) {
      int anoDeLancamento = 2022;
      boolean incluidoNoPlano = true;
      double notaDoFilme = 7.8;
      String tipoPlano = "plus";


      // IF e ELSE
      if (anoDeLancamento >= 2022){
         System.out.println("Lançamentos que os clientes estão curtindo!");
      } else {
         System.out.println("Filmes retros que valem a pena assistir!");
      }

      if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
         System.out.println("Filme liberado!");
      } else {
         System.out.println("Negado. Deve-se pagar a locação.");
      }


      /*SWITCH CASE
       int dia = 3
       String nomeDia;

       switch (dia) {
          case 1:
             nomeDia = "domingo";
             break;
          case 2:
             nomeDia = "segunda-feira";
             break;
          case 3:
             nomeDia = "terça-feira";
             break;
          case 4:
             nomeDia = "quarta-feira";
             break;
          case 5:
             nomeDia = "quinta-feira";
             break;
          case 6:
             nomeDia = "sexta-feira";
             break;
          case 7:
             nomeDia = "sábado";
             break;
          default:
             nomeDia = "Dia inválido";
             break;
       }
       System.out.println("O dia " + dia + " é " + nomeDia);*/


    }
}
