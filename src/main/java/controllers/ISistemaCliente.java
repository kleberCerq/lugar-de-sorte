package controllers;
import java.util.List;

import models.Bilhete;
import models.Cliente;
import models.Sorteio;

public interface ISistemaCliente {
    
      public List<String> estabelecimentosProximos();
	  public Bilhete comprarBilhetes(String codigo, Cliente cliente, float precoBilhete, String cpfCliente, Sorteio sorteio);
	  public void avaliacaoEmpresa();
	  public void historicoSorteios();
      public void acessarDados();

	}