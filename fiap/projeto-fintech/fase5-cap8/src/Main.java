public class Main {
    public static void main(String[] args) {
        System.out.println("Projeto Fintech");

        //Random random = new Random();
        // Cliente, Conta, Investimento, Transação
        // cada cliente pode ter uma ou mais contas
        // cada conta pode fazer varios investimentos e transações
        // cada transação precisa fazer de uma ou duas contas
        // Cliente (superclasse) Conta(subclasse)
        // Cliente -> id, nome, email, senha
        // Conta -> idConta, idCliente, Saldo
        // Investimento -> JurosSimples ou JurosCompostos --> idConta, tipo, dinheito investido, juros, tempo
        // Transaçãõ -> idConta e idOutraConta, valor, data, metodo, tipo, titulo, descrição

        Cliente cliente1 = new Cliente();
        //cliente1.setClienteId(random.nextInt(100));
        cliente1.setNome("Fulano");
        cliente1.setEmail("fulano@email.com");
        cliente1.setTelefone("77944445555");
        cliente1.setEndereco("Brasil");
        cliente1.setSenha("fulano123");
        cliente1.exibirCliente();




    }
}

