package models;

import java.util.List;
import models.Sorteio;

public class Empresa extends Usuario {
    private String cnpj;
    private List<Sorteio> sorteios;

    public Empresa(String nome, String email, String senha, String cnpj) {
        super(nome, email, senha);
        this.cnpj = cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }
}
