public class Bateria extends Produto {
    public Integer numeroTambores;

    public Bateria() {
        super();
    }

    public Bateria(String nome, String marca, Integer numeroTambores) {
        super(nome, marca);
        this.numeroTambores = numeroTambores;
    }

    public Integer getNumeroTambores() {
        return numeroTambores;
    }

    public Bateria setNumeroTambores(Integer numeroTambores) {
        this.numeroTambores = numeroTambores;
        return this;
    }

    @Override
    public String getFormaEntrega() {
        return "Apenas retirada na loja!";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bateria{");
        sb.append("numeroTambores=").append(numeroTambores);
        sb.append(", nome='").append(nome).append(' ');
        sb.append(", marca='").append(marca).append(' ');
        sb.append('}');
        return sb.toString();
    }
}