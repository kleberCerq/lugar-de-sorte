package model;
import java.util.Date;

public class Bilhete {
    private String codigo;
	private Date dataDoSorteio;
	private float precoBilhete;
	private String premio;
    private String cpfCliente;



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
}