package org.example.entities;

import jakarta.persistence.*;

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

    public Faculdade( Long idFalcudade, String nome, String cnpj, String endereco, String telefone){
        this.idFalcudade = idFalcudade;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
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
}
