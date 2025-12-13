package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Turma {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;
    private String ano;
    private String semestre;
    private String turno;
    private String sala;

    public Turma( Long idTurma, String ano, String semestre, String turno, String sala){
        this.idTurma = idTurma;
        this.ano = ano;
        this.semestre = semestre;
        this. turno = turno;
        this.sala = sala;
    }

    public Long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Long idTurma) {
        this.idTurma = idTurma;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
