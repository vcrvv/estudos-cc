public abstract class Produto {
    public String nome;
    public String marca;

    public Produto() {
    }

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Produto setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getFormaEntrega() {
        return "Entregamos esse produto";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append(' ');
        sb.append(", marca='").append(marca).append(' ');
        sb.append('}');
        return sb.toString();
    }
}