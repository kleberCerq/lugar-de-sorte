package control;
import java.util.List;

import model.Bilhete;

public interface ISistemaCliente {
    
      public List<String> estabelecimentosProximos();
	  public Bilhete comprarBilhetes();
	  public void avaliacaoEmpresa();
	  public void historicoSorteios();
      public void acessarDados();

	}