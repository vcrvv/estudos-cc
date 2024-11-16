package br.com.fiap.financafacil.model;

import java.util.Date;

public class Transacao {
    private Integer idTransacao;
    private Double valor;
    private String tipo;
    private String metodo;
    private String categoria;
    private String descricao;
    private Date dataTransacao;
    private Integer idConta;

    public Transacao() {
    }

    public Transacao(Integer idTransacao, Double valor, String tipo, String metodo, String categoria, String descricao,
            Date dataTransacao, Integer idConta) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.tipo = tipo;
        this.metodo = metodo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataTransacao = dataTransacao;
        this.idConta = idConta;
    }

    public Transacao(Double valor, String tipo, String metodo, String categoria, String descricao, Integer idConta) {
        this.valor = valor;
        this.tipo = tipo;
        this.metodo = metodo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataTransacao = new Date();
        this.idConta = idConta;
    }

    public Integer getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Integer idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Integer getIdConta() { return idConta; }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
