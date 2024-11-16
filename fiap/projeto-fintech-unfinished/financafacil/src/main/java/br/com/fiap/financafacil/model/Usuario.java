package br.com.fiap.financafacil.model;

import java.time.LocalDate;
public class Usuario {
    private Integer idUsuario;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private LocalDate dataNascimento;
    private LocalDate dataCriada;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nome, String email, String telefone, String senha,
            LocalDate dataNascimento, LocalDate dataCriada) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.dataCriada = dataCriada;
    }

    public Integer getIdUsuario() { return idUsuario; }

    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public LocalDate getDataNascimento() { return dataNascimento; }

    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public LocalDate getDataCriada() { return dataCriada; }

    public void setDataCriada(LocalDate dataCriada) { this.dataCriada = dataCriada; }
}
