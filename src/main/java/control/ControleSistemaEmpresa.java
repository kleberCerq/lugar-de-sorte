package control;
import java.util.ArrayList;
import java.util.List;

import model.Bilhete;
import model.Cliente;
import model.Sorteios;
import model.Usuario;
//import view.TelaCriarSorteio;


public class ControleSistemaEmpresa implements ISistemaEmpresa{
    @Override
    public void excluirSorteio(Usuario usuario, Sorteios sorteio){
        //verificar se esta funcionado
        List<Sorteios> listaSor = usuario.getListaSorteios();

        for (int i =0; i < listaSor.size(); i++){
            Sorteios s = listaSor.get(i);
            //testar se o codigo abaixo esta comparando os endereços e se da certo usar isso.
            if (s.equals(sorteio)) {
                listaSor.remove(s);
                break;
            }
        }
    }

    @Override
    public void verificarInscritos(Sorteios sorteios){
        //verificar se esta funcionando
        List<Cliente> clie = participantes(sorteios);
        
        for(int i = 0; i < clie.size(); i++){
            System.out.print(clie.get(i).getNome() + " está inscrito\n");            
        }
    }

    @Override
    public boolean verificarParticipante(Cliente cliente, Sorteios sorteios){
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
    public List<Cliente> participantes(Sorteios sorteios) {
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
    }
    
    @Override
    public void cadastrarResultado(Sorteios sorteios, String codigo){
        //verificar se funciona
        sorteios.setBilheteSorteado(codigo);   
        System.out.println("Resultado do sorteio cadastrado: " );
    }

}