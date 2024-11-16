package models;
import java.util.Date;

public class Bilhete {
    //talvez precise alterar para public, testar depois
    private String codigo;
    private Cliente cliente;
	private Date dataDoSorteio;
	private float precoBilhete;
	private String premio;
    private String cpfCliente;

    public Bilhete(String codigo, Cliente cliente, Date dataDoSorteio, float precoBilhete, String premio, String cpfCliente){
        this.codigo = codigo;
        this.cliente = cliente;
        this.dataDoSorteio = dataDoSorteio;
        this.precoBilhete = precoBilhete;
        this.premio = premio;
        this.cpfCliente = cpfCliente;
    }
     // Getters e Setters
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataDoSorteio() {
        return dataDoSorteio;
    }

    public void setDataDoSorteio(Date dataDoSorteio) {
        this.dataDoSorteio = dataDoSorteio;
    }

    public float getPrecoBilhete() {
        return precoBilhete;
    }

    public void setPrecoBilhete(float precoBilhete) {
        this.precoBilhete = precoBilhete;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
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