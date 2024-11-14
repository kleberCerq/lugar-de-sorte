package controllers;
import java.util.List;

import models.Bilhete;

public interface ISistemaCliente {
    
      public List<String> estabelecimentosProximos();
	  public Bilhete comprarBilhetes();
	  public void avaliacaoEmpresa();
	  public void historicoSorteios();
      public void acessarDados();

	}