public class Item {
    String nome;
    String descricao;
    boolean raro;
    int nivelPoder;

    // Construtor
    public Item(String nome, String descricao, boolean raro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }
}