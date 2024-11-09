package model;

import java.util.Date;
import java.util.List;

public class Sorteios{
    //talvez precise alterar para public, testar depois
	private Date dataCriacao;
	private Date dataRealizacao;
    private boolean status;
	private String bilheteSorteado;
	private String empresaDona;
	private String premio;
	private List<Bilhete> meusBilhetes;



     // Getters e Setters
     public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBilheteSorteado() {
        return bilheteSorteado;
    }

    public void setBilheteSorteado(String bilheteSorteado) {
        this.bilheteSorteado = bilheteSorteado;
    }

    public String getEmpresaDona() {
        return empresaDona;
    }

    public void setEmpresaDona(String empresaDona) {
        this.empresaDona = empresaDona;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public List<Bilhete> getMeusBilhetes() {
        return meusBilhetes;
    }

    public void setMeusBilhetes(List<Bilhete> meusBilhetes) {
        this.meusBilhetes = meusBilhetes;
    }    
}
