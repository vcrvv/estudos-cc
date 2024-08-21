import java.util.ArrayList;

public class ListandoPolimorfismo {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();

        //sintaxe lista.add(objeto aceito pela lista)
        produtos.add(new Bateria("HD-1", "Roland", 7));
        produtos.add(new Guitarra("T-506C", "Tagima", "Mapple"));
        produtos.add(new Bateria("Premium", "Pinguim", 5));

        //looping que executa para cada objeto do tipo Produto
        //presente na lista produtos
        for (var produtoNaLista : produtos) {
            System.out.println("O produto: " + produtoNaLista + " tem forma de entrega: " + produtoNaLista.getFormaEntrega());
        }

    }

}