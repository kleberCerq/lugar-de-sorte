package dao;

import models.Cliente;
import models.Empresa;

public interface ISistemaDAO {
    public void setCliente(Cliente cliente);

    public Cliente getCliente(String senha, String cpf);

    public void setEmpresa(Empresa empresa);

    public Empresa getEmpresa(String senha, String cnpj);
}
