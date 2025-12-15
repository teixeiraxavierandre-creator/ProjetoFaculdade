package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Faculdade {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFalcudade;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String emailInstitucional;
    private String site;
    private Date dataFundacao;
    

    public Faculdade( Long idFalcudade, String nome, String cnpj, String endereco, String telefone,String emailInstitucional, String site, Date dataFundacao){
        this.idFalcudade = idFalcudade;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.emailInstitucional = emailInstitucional;
        this.site = site;
        this.dataFundacao = dataFundacao;
    }

    public Long getIdFalcudade() {
        return idFalcudade;
    }

    public void setIdFalcudade(Long idFalcudade) {
        this.idFalcudade = idFalcudade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEMailInstitucional(){
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getSite(){
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Date getDataFundacao(){
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
