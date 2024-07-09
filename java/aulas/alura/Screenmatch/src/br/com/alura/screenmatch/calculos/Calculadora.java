package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.*;

public class Calculadora {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
