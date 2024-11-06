package control;
import java.util.List;

import model.Cliente;

public class ControleSistemaEmpresa implements ISistemaEmpresa{
    
    @Override
    public void excluirSorteio(){

    }
    @Override
    public void verificarInscritos(){

    }

    @Override
    public boolean verificarParticipante(Cliente cliente){
        return true;

    }

    @Override
    public List<Cliente> participantes(){
        // Lógica para obter os participantes
        return null;  // Exemplo de retorno
    }

    @Override
    public void criarSorteio(){

    }

    @Override
    public void cadastrarResultado(){

    }

}