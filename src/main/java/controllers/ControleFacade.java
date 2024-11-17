package controllers;

import java.util.List;

import models.Bilhete;
import models.Cliente;
import models.Sorteio;
import models.Usuario;

public class ControleFacade implements IFacade{
    protected ControleSistema Sisten;
    protected ControleSistemaCliente SistenClient;
    protected ControleSistemaEmpresa SistenEmpresa;

    public ControleFacade(ControleSistema Sisten, ControleSistemaCliente SistenClient, ControleSistemaEmpresa SistenEmpresa){
        this.Sisten = Sisten;
        this.SistenClient = SistenClient;
        this.SistenEmpresa = SistenEmpresa;
    }

    //ControleSistema
    @Override
    public Usuario cadastrarUsuario(String nome, String cpf, String cnpj, String email, String senha){
        return Sisten.cadastrarUsuario(nome, cpf, cnpj, email, senha);
    }

    //ControleSistemaCliente
    @Override
    public List<String> estabelecimentosProximos(){
        return SistenClient.estabelecimentosProximos();
    }

    @Override
    public Bilhete comprarBilhetes(String codigo, Cliente cliente, float precoBilhete, String cpfCliente, Sorteios sorteio){
        return SistenClient.comprarBilhetes(codigo, cliente, precoBilhete, cpfCliente, sorteio);
    }

    @Override
    public void avaliacaoEmpresa(){
        SistenClient.avaliacaoEmpresa();
    }

    @Override
    public void historicoSorteios(){
        SistenClient.historicoSorteios();
    }

    @Override
    public void acessarDados(){
        SistenClient.acessarDados();
    }
    
    //ControleSistemaEmpresa
    @Override
    public void excluirSorteio(Usuario usuario, Sorteio sorteio){
        SistenEmpresa.excluirSorteio(usuario, sorteio);
    }

    @Override
    public void verificarInscritos(Sorteio sorteios){
        SistenEmpresa.verificarInscritos(sorteios);
    }

    @Override
    public boolean verificarParticipante(Cliente cliente, Sorteio sorteios){
        return SistenEmpresa.verificarParticipante(cliente, sorteios);
    }

    @Override
    public List<Cliente> participantes(Sorteio sorteios){
        return SistenEmpresa.participantes(sorteios);
    }

    @Override
    public void criarSorteio(){
        //falar com o kleber como vai criar isso no controle sistema
    }

    @Override
    public void cadastrarResultado(Sorteio sorteios, String codigo){
        SistenEmpresa.cadastrarResultado(sorteios, codigo);
    }
}
