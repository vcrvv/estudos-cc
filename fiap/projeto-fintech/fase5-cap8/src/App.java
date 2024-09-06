
public class App {
    public static void main(String[] args) {
        System.out.println("Projeto Fintech.");

        // Criando cliente
        Cliente cliente1 = new Cliente(
                1,
                "Fulano",
                "fulano@email.com",
                "69988887777",
                "fulano123");

        // Criando contas
        cliente1.abrirConta("2121", 2000);
        cliente1.abrirConta("3636", 2000);

        // Exibindo visão geral do cliente
        cliente1.exibirCadastro();

        // Acessando uma conta especifica pelo número dela
        Conta conta1 = cliente1.getContaPorNumero("2121");
        if (conta1 != null) {
            // Registrando transações
            Transacao entrada = new Entrada(500.00, "PIX", "Entrada inicial");
            Transacao saida = new Saida(200.00, "Débito", "Conta de Energia");

            conta1.adicionarTransacao(entrada);
            conta1.adicionarTransacao(saida);

            conta1.exibirSaldo();
            conta1.exibirTransacoes();
        }
    }
}
