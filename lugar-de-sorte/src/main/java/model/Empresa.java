package model;

public class Empresa extends Usuario {
    private String cnpj;
    private float nota;

    public Empresa(String nome, String senha, String email, String endereco, int numeroTelefone, String cnpj, float nota) {
        super(nome, senha, email, endereco, numeroTelefone);  // Chama o construtor da classe pai
        this.cnpj = cnpj;
        this.nota = nota;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}