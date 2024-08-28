public class Main {
    public static void main(String[] args) {
        System.out.println("Projeto Fintech");


        Cliente cliente1 = new Cliente(
            1,
            "Vinicius",
            "vini@email.com",
            "88977776666",
            "vini123"
        );

        cliente1.abrirConta("111", 1000);
        cliente1.abrirConta("000", 5000);

        cliente1.visualizarCadastro();
        cliente1.visualizarExtrato();
    
        JurosCompostos investimento1 = new JurosCompostos(1, "vini", 10, 10000, 2);
        
    }
}
