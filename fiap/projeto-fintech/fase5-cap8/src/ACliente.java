
public class ACliente {
    // Atributos
    private int clienteId;  
    private String nome;     
    private String endereco;     
    private String telefone;    
    private String email;    
    private String senha;    

    // Construtores
    public ACliente () {}

    public ACliente (String nome, String endereco, String telefone, String email, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    
    // Getters e Setters
    public int getClienteId() {return clienteId;}
    public void setClienteId(int clienteId) {this.clienteId = clienteId;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    
    // Métodos
    public void exibirCliente() {
        System.out.println("=======Cliente=======");
        System.out.println("Id: " + clienteId);
        System.out.println("Nome: " + nome);
        System.out.println("E-Mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Senha: " + senha);
    }

}