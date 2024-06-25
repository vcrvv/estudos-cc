public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        // formatações
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: %d ".formatted(anoDeLancamento));

        boolean incluidoNoPlano = false;
        System.out.println("Possui Plano: " + incluidoNoPlano);

        double media = (8.0 + 7.0 + 4.0) / 3;
        System.out.println(String.format("Nota: %.2f", media));

        String sinopse;
            sinopse = """
            Filme de 
            aventura 
            com galã dos anos 
            80
            """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
