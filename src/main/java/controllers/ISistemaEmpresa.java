package controllers;

import java.util.List;

import models.Cliente;
import models.Sorteio;
import models.Usuario;

public interface ISistemaEmpresa {
    public void excluirSorteio(Usuario usuario, Sorteio sorteio);
    public void verificarInscritos(Sorteio sorteio);
    public boolean verificarParticipante(Cliente cliente, Sorteio sorteio);
    public List<Cliente> participantes(Sorteio sorteio);
    public void criarSorteio();
    public void cadastrarResultado(Sorteio sorteio, String codigo);
}
