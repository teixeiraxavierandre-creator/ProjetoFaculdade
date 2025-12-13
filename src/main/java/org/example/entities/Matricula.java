package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Matricula {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatricula;
    private Date dataMatricula;
    private String status;
    private String semestre;
    private String valor;

    public Matricula( Long idMatricula, Date dataMatricula, String status, String semestre, String valor){
        this.idMatricula = idMatricula;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.semestre = semestre;
        this.valor = valor;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
