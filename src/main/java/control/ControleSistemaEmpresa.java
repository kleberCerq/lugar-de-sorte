package control;
import java.util.List;

import model.Usuario;
import model.Bilhetes;
import model.Cliente;

public class ControleSistemaEmpresa implements ISistemaEmpresa{
    
    @Override
    public void excluirSorteio(Usuario usuario, Sorteios sorteio){
        //verificar se esta funcionado
        ArrayList<Sorteios> listaSor = usuario.listaSorteios;
        for (int i =0; i < listaSor.size(); i++){
            Sorteios s = ListaSor.get(i);
            //testar se o codigo abaixo esta comparando os endereços e se da certo usar isso.
            if(s = sorteio){
                usuario.listaSorteios.remove(s);
                break;
            }
        }
    }
    @Override
    public void verificarInscritos(Sorteios sorteios){
        //verificar se esta funcionando
        ArrayList<Client> clie = participantes(sorteios);
        for(int i = 0; i < clie.size(); i++){
            System.out.print(clie.get(i).nome() + " esta presente\n");            
        }
    }

    @Override
    public boolean verificarParticipante(Cliente cliente, Sorteios sorteios){
        //verificar se esta funcionando
        ArrayList<Client> clie = participantes(sorteios);
        for(int i = 0; i < clie.size(); i++){
            Cliente c = clie.get(i);
            if (cliente = c){
                System.out.print(clie.get(i).nome() + " esta presente\n");
                break;
            }
        }

    }

    @Override
    public List<Cliente> participantes(Sorteios sorteios){
        //verificar se esta funcionando
        ArrayList<Bilhetes> bilhetes = sorteios.meusBilhetes();
        List<Cliente> client = new ArrayList<Cliente>();
        //esta retornando valores de usuarios repetidos caso eles possuam mais de um bilhete
        for(int i = 0; i < bilhetes.size(); i++){
            client.add(new Cliente(bilhetes.usuario));
        }
        // Lógica para obter os participantes
        return client;  // Exemplo de retorno
    }

    @Override
    public void criarSorteio(){

    }

    @Override
    public void cadastrarResultado(Sorteios sorteios, string codigo){
        //verificar se funciona
        sorteios.bilheteSorteado = codigo;
    }

}