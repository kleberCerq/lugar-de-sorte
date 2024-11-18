package controllers;
import java.util.ArrayList;

import models.Bilhete;
import models.Cliente;
import models.Sorteio;

public class ControleSistemaCliente implements ISistemaCliente{

    @Override
    public Bilhete comprarBilhetes(String codigo, Cliente cliente, float precoBilhete, String cpfCliente, Sorteio sorteio){
        Bilhete b = new Bilhete(codigo, cliente, precoBilhete, cpfCliente, sorteio);
        cliente.cadastrarBilhete(b);
        return b;
    }

    @Override
    public void historicoSorteios(Cliente cliente){
        ArrayList<Bilhete> b = cliente.getBilhetes();
        for (int i = 0; i < b.size()-1; i++) {    
            Sorteio s = b.get(i).getSorteio();
            System.out.println("Sorteio realizado pela empresa: "+s.getEmpresaDona()+" Data: "+ s.getDataRealizacao()+" Premio: "+s.getPremio()+" Numero do Bilhete: "+b.get(i).getCodigo());            
        }
    }
}