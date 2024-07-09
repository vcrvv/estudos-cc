public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();


        Calculadora calc = new Calculadora();
        calc.dobro(5);
        Calculadora calc2 = new Calculadora();
        int resultado = calc2.dobrar(10);
        System.out.println(resultado);


        Musica musica1 = new Musica();
        musica1.setTitulo("Fingerbib");
        musica1.setArtista("Aphex Twin");
        musica1.setAnoLancamento(1996);
        musica1.exibirFichaTecnica();
        musica1.avaliacao(8);
        musica1.avaliacao(9);
        musica1.avaliacao(10);
        System.out.println("Avaliação Media: " + musica1.mediaAvaliacao());
    }
}
