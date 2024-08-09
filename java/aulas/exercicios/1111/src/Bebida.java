//Aqui inicia a subclasse Bebida
//que herda da superclasse Produto
public class Bebida extends Produto {
	//A subclasse tem um atributo a mais do
	//que a super classe
	private int quantidade;
    private int tamanho;


	//A subclasse tem seus próprios construtores
	public Bebida() {
		super();	
	}
	public Bebida(String nome, String ingredientes, double preco, int quantidade) {
		//abaixo, invocamos o construtor da superclasse
		//para atribuir o nome, os ingredientes e
		//o preço da bebida
		super(nome, ingredientes, preco);
		//como o construtor da superclasse não possui quantidade,
		//essa atribuição é feita separadamente
		this.quantidade = quantidade;
	}

	//Os métodos da superclasse já foram herdados,
	//portanto, bastou criar os métodos exclusivos
	//da subclasse
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//A superclasse nos obriga a criar
	//um método chamado getResumo() que retorne uma String
	@Override
	public String getResumo() {
		return "Nome: " + this.getNome() + 
        "Ingredientes: " + this.getIngredientes() + 
        "Preco: R$" + this.getPreco() + 
        "Quantidade: " + this.getQuantidade() + "ml";
	}
}