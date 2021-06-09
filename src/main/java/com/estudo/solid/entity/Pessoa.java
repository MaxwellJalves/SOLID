package com.estudo.solid.entity;

public class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(int id,String nome, String cpf, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String  getPessoa(){
        return
                "id :" + id +
                ", nome'" + nome + '\'' +
                ", cpf'" + cpf + '\'' +
                ", idade" + idade
                ;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
