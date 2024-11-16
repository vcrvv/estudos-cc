package br.com.fiap.financafacil.model;

public class Conta {
    private Integer idConta;
    private Double saldo;
    private Integer idUsuario;

    public Conta() {
    }

    public Conta(Integer idConta, Double saldo, Integer idUsuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.idUsuario = idUsuario;
    }

    public Conta(Integer idUsuario, Double saldo) {
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getIdUsuario() { return idUsuario; }

    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
}
