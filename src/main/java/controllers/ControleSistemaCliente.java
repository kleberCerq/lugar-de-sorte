package controllers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Bilhete;
import models.Cliente;

public class ControleSistemaCliente implements ISistemaCliente{
    
    @Override
    public List<String> estabelecimentosProximos() {
        // Implementação do método retornando um List<String>
        List<String> proximos = new ArrayList<>();
        proximos.add("Estabelecimento A");
        proximos.add("Estabelecimento B");
        return proximos;
    }

    @Override
    public Bilhete comprarBilhetes(String codigo, Cliente cliente, Date dataDoSorteio, float precoBilhete, String premio, String cpfCliente){
        return new Bilhete(codigo, cliente, dataDoSorteio, precoBilhete, premio, cpfCliente);  
    }

    @Override
    public void avaliacaoEmpresa() {
        // Implementação do método
        System.out.println("Avaliação da empresa realizada.");
    }

    @Override
    public void historicoSorteios(){
        
    }

    @Override
    public void acessarDados(){

    }

}