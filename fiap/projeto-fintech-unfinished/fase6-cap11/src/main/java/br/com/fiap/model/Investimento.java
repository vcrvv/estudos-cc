package br.com.fiap.model;

import java.util.Date;
import java.time.LocalDate;

public class Investimento {
    private Integer idInvestimento;
    private String titulo;
    private Double valorInvestido;
    private LocalDate dataInicial;
    private Double taxa;
    private Double valorFinal;
    private Date dataFinal;
    private Integer idConta;

    public Investimento() {
    }

    public Investimento(Integer idInvestimento, String titulo, Double valorInvestido, LocalDate dataInicial,
            Double taxa, Double valorFinal, Date dataFinal, Integer idConta) {
        this.idInvestimento = idInvestimento;
        this.titulo = titulo;
        this.valorInvestido = valorInvestido;
        this.dataInicial = dataInicial;
        this.taxa = taxa;
        this.valorFinal = valorFinal;
        this.dataFinal = dataFinal;
        this.idConta = idConta;
    }

    public Investimento(String titulo, Double valorInvestido, LocalDate dataInicial, Double taxa, Integer idConta) {
        this.titulo = titulo;
        this.valorInvestido = valorInvestido;
        this.dataInicial = dataInicial;
        this.taxa = taxa;
        this.idConta = idConta;
    }

    public Integer getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(Integer idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
