package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Professor {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessor;
    private String nome;
    private String cpf;
    private  String titulacao;
    private String email;

    public Professor(Long idProfessor, String nome, String cpf, String titulacao, String email){
        this.idProfessor = idProfessor;
        this.nome= nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.email = email;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
