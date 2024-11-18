package controllers;
import models.Bilhete;
import models.Cliente;
import models.Sorteio;

public interface ISistemaCliente {
    
	  public Bilhete comprarBilhetes(String codigo, Cliente cliente, float precoBilhete, String cpfCliente, Sorteio sorteio);
	  public void historicoSorteios(Cliente cliente);
	}