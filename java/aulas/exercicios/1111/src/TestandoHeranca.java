public class TestandoHeranca {

	public static void main(String[] args) {
		Bebida bebida = new Bebida();
		bebida.setNome("Suco de laranja");
		bebida.setIngredientes("Água, laranja, açúcar e gelo");
		bebida.setPreco(7.85);
		bebida.setQuantidade(500);

		System.out.print("A bebida informada foi " + bebida.getNome());
		System.out.print(", é composta por " + bebida.getIngredientes());
		System.out.print(", sua quantidade é de " + bebida.getQuantidade() + "ml ");
		System.out.print("e custa R$" + bebida.getPreco());
		
	}
}

