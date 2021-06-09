package com.estudo.solid.entity.rh;

public class Funcionario {

    private long matricula;
    private String nome;
    private Departamento departamento;
    private Funcao funcao;

    public Funcionario(){

    }
    public Funcionario(long matricula, String nome, Departamento departamento, Funcao funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.funcao = funcao;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

@Override
public String toString() {
    return "Funcionario{" +
            "matricula=" + matricula +
            ", nome='" + nome + '\'' +
            ", departamento=" + departamento +
            ", funcao=" + funcao +
            '}';
}
}
