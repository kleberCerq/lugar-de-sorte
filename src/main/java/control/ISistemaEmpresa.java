package control;

import java.util.List;

import model.Cliente;
import model.Sorteios;
import model.Usuario;

public interface ISistemaEmpresa {
    public void excluirSorteio(Usuario usuario, Sorteios sorteio);
    public void verificarInscritos(Sorteios sorteio);
    public boolean verificarParticipante(Cliente cliente, Sorteios sorteio);
    public List<Cliente> participantes(Sorteios sorteio);
    public void criarSorteio();
    public void cadastrarResultado(Sorteios sorteio, String codigo);
}
