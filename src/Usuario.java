/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public abstract class Usuario {
    private String nome;
    private String cpf;
    private String id;
    private String endereco;
    private String telefone;
    private String senha;

    public Usuario(String nome, String cpf, String id, String endereco, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", id=" + id + ", endereco=" + endereco + ", telefone=" + telefone + ", senha=" + senha + '}';
    }
    
}
