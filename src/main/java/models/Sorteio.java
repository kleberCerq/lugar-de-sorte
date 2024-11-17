package models;

import java.util.Date;
import java.util.List;

public class Sorteio {
    private Date dataCriacao;
    private Date dataRealizacao;
    private boolean status;
    private String bilheteSorteado; //
    private String empresaDona; //
    private String premio;
    private List<Bilhete> bilhetes; //
    private String descricao;

    public Sorteio(Date dataRealizacao, String premio, int totalBilhetes, String descricao) {
        this.dataRealizacao = dataRealizacao;
        this.dataCriacao = new Date();
        this.status = true;
        this.premio = premio;
        for (int i = 0; i < totalBilhetes; i++) {
            // this.bilhetes.add(new Bilhete());
        }
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Date getDataRealizacao() {
        return this.dataRealizacao;
    }

    public void setStatus(boolean status) { //
        this.status = status; //
    } //

    public boolean getStatus() {
        return this.status;
    }

    public void setBilheteSorteado(String bilheteSorteado) { //
        this.bilheteSorteado = bilheteSorteado; //
    } //

    public String getBilheteSorteado() { //
        return this.bilheteSorteado; //
    } //

    public void setEmpresaDona(String empresaDona) { //
        this.empresaDona = empresaDona; //
    } //

    public String getEmpresaDona() { //
        return this.empresaDona; //
    } //

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getPremio() {
        return this.premio;
    }

    public void setMeusBilhetes(List<Bilhete> meusBilhetes) { //
        this.bilhetes = meusBilhetes; //
    } //

    public List<Bilhete> getMeusBilhetes() { //
        return this.bilhetes; //
    } //

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
