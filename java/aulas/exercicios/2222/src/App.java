public class App {
    public static void main(String[] args) {
        // Vetor com nomes de produtos no estoque
        String[] produtosEstoque = {"Notebook", "Smartphone", "Tablet", "Fone de ouvido", "Carregador portátil"};

        // Produto que desejamos verificar no estoque
        String produtoProcurado = "Tablet";

        // Verificando a disponibilidade do produto
        boolean produtoEncontrado = false;
        int i = 0;
        while (!produtoEncontrado && i < produtosEstoque.length){
            if(produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        // Imprimindo o resultado da busca
        if(produtoEncontrado) {
            System.out.println(produtoProcurado + " está disponível no estoque.");
        } else {
            System.out.println(produtoProcurado + " não foi encontrado no estoque.");
        }
  }
}
