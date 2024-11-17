package models;
import java.util.Date;

public class Bilhete {
    //talvez precise alterar para public, testar depois
    private String codigo;
    private Cliente cliente;
	private float precoBilhete;
    private String cpfCliente;
    private Sorteio sorteio;

    public Bilhete(String codigo, Cliente cliente, float precoBilhete, String cpfCliente, Sorteios sorteio){
        this.codigo = codigo;
        this.cliente = cliente;
        this.precoBilhete = precoBilhete;
        this.cpfCliente = cpfCliente;
        this.sorteio = sorteio;
    }
     // Getters e Setters
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataDoSorteio() {
        return sorteio.getDataRealizacao();
    }

    //                         acho que não tem necessidade poder alterar a data do sorteio
    //public void setDataDoSorteio(Date dataDoSorteio) {
    //    this.dataDoSorteio = dataDoSorteio;
    //}

    public float getPrecoBilhete() {
        return precoBilhete;
    }

    public void setPrecoBilhete(float precoBilhete) {
        this.precoBilhete = precoBilhete;
    }

    public void getPremio() {
        System.out.printf("O premio é: %s",sorteio.getPremio());
    }

    public void setPremio(String premio) {
        this.sorteio.setPremio(premio);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

      // Método para acessar o cliente associado ao bilhete
      public Cliente getCliente() {
        return cliente;
    }

    // Se necessário, método para definir o cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}