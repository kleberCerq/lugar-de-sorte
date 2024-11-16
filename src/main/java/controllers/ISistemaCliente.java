package controllers;
import java.util.Date;
import java.util.List;

import models.Bilhete;
import models.Cliente;

public interface ISistemaCliente {
    
      public List<String> estabelecimentosProximos();
	  public Bilhete comprarBilhetes(String codigo, Cliente cliente, Date dataDoSorteio, float precoBilhete, String premio, String cpfCliente);
	  public void avaliacaoEmpresa();
	  public void historicoSorteios();
      public void acessarDados();

	}