package br.com.fiap.financafacil.model;

import java.time.LocalDate;
import java.util.Date;

public class Divida {
    private Integer idDivida;
    private String titulo;
    private Double valorInicial;
    private LocalDate dataInicial;
    private Double taxa;
    private Double valorFinal;
    private Date dataFinal;
    private Integer idConta;

    public Divida() {
    }

    public Divida(Integer idDivida, String titulo, Double valorInicial, LocalDate dataInicial, Double taxa, Double valorFinal, Date dataFinal, Integer idConta) {
        this.idDivida = idDivida;
        this.titulo = titulo;
        this.valorInicial = valorInicial;
        this.dataInicial = dataInicial;
        this.taxa = taxa;
        this.valorFinal = valorFinal;
        this.dataFinal = dataFinal;
        this.idConta = idConta;
    }

    public Divida(String titulo, Double valorInicial, LocalDate dataInicial, Double taxa, Integer idConta) {
        this.titulo = titulo;
        this.valorInicial = valorInicial;
        this.dataInicial = dataInicial;
        this.taxa = taxa;
        this.idConta = idConta;
    }

    public Integer getIdDivida() {
        return idDivida;
    }

    public void setIdDivida(Integer idDivida) {
        this.idDivida = idDivida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
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
