package com.sistemaestudantes.demo.model;

public class Estudante {

    private String matricula;
    private String nome;
    private String curso;
    private int semestre;

    public Estudante(String matricula, String nome, String curso, int semestre) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}