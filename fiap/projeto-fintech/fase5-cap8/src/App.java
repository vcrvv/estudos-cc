public class App {
    public static void main(String[] args) {
        System.out.println("Projeto Fintech.");

        Cliente cliente1 = new Cliente(
            1, 
            "Fulano",
            "fulano@email.com",
            "69988887777", 
            "fulano123"
        );

        cliente1.abrirConta("2222", 2000);
        cliente1.abrirConta("3333", 2000);

        cliente1.exibirCadastro();


    }

}
