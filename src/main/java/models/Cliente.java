package models;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private String cpf;
    protected ArrayList<Bilhete> bilhetes;

    public Cliente(String nome, String email, String senha, String cpf) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.bilhetes = new ArrayList<>();
    }

    public void cadastrarBilhete(Bilhete bilhete){
        bilhetes.add(bilhete);
    }

    public ArrayList<Bilhete> getBilhetes(){
        return bilhetes;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
}
