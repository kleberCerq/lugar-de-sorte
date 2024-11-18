package controllers;
import java.util.ArrayList;
import java.util.List;

import models.Bilhete;
import models.Cliente;
import models.Sorteio;


public class ControleSistemaEmpresa implements ISistemaEmpresa{

    @Override
    public void verificarInscritos(Sorteio sorteios){
        //verificar se esta funcionando
        List<Cliente> clie = participantes(sorteios);
        
        for(int i = 0; i < clie.size(); i++){
            System.out.print(clie.get(i).getNome() + " está inscrito\n");            
        }
    }

    @Override
    public boolean verificarParticipante(Cliente cliente, Sorteio sorteios){
        //verificar se esta funcionando
       List<Cliente> clie = participantes(sorteios);
       
       for (Cliente c : clie) {
        if (cliente.equals(c)) {
            //System.out.print(c.getNome() + " está presente\n");
            return true;
            }
        }
        return false;
    }

    @Override
    public List<Cliente> participantes(Sorteio sorteios) {
    List<Bilhete> bilhetes = sorteios.getMeusBilhetes(); // Altere para List<Bilhete>
    List<Cliente> client = new ArrayList<>();

    // Itera sobre cada bilhete para acessar o usuário
    for (Bilhete bilhete : bilhetes) {
        client.add(bilhete.getCliente());  // Adiciona o usuário associado ao bilhete
    }

        return client;  
    }

    @Override
    public void criarSorteio(){
        // Exibe a tela para o usuário preencher os dados do sorteio
      //  new TelaCriarSorteio().setVisible(true);
      // sempre que um sorteio for cirado deve ser adicionado a lista sorteios presente no model de empresa
    }
    
    @Override
    public void cadastrarResultado(Sorteio sorteios, String codigo){
        //verificar se funciona
        sorteios.setBilheteSorteado(codigo);   
        System.out.println("Resultado do sorteio cadastrado: " );
    }

}