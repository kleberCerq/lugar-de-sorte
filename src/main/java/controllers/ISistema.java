package controllers;

import models.Usuario;

public interface ISistema {
    public Usuario cadastrarUsuario(String nome, String email, String senha, String cpf, String cnpj);

    public Usuario logarUsuario(String senha, String cpf, String cnpj);
}
