package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    //talvez precise alterar para public, testar depois
	private String nome;
	private String senha;
    private String email;
    private String endereco;   
	private List<Sorteios> listaSorteios = new ArrayList<>();

    private int numeroTelefone;	

    // Construtor
    public Usuario(String nome, String senha, String email, String endereco, int numeroTelefone) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    // Get e set da lista de sorteios
    public List<Sorteios> getListaSorteios() {
        return listaSorteios;
    }

    public void setListaSorteios(List<Sorteios> listaSorteios) {
        this.listaSorteios = listaSorteios;
    }
}