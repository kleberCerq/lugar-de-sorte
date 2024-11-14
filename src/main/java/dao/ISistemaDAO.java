package dao;

public interface ISistemaDAO {
    public void adicionarCliente(String nome, String cnpj, String email, String senha);

    public void adicionarEmpresa(String nome, String cpf, String email, String senha);
}
