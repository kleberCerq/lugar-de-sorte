package control;
import java.util.ArrayList;
import java.util.List;

import model.Bilhete;

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
    public Bilhete comprarBilhetes(){
        return new Bilhete();  
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