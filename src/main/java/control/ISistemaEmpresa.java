package control;
import java.util.List;

import model.Cliente;
public interface ISistemaEmpresa {

      public void excluirSorteio();
	  public void verificarInscritos();
	  public boolean verificarParticipante(Cliente cliente);
      public List<Cliente> participantes();
      public void criarSorteio();
	  public void cadastrarResultado();
	}