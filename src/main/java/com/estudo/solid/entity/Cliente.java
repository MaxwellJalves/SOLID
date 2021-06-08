package com.estudo.solid.entity;

public class Cliente extends Pessoa{

    private String tipo;

    public Cliente(int id, String nome, String cpf, int idade, String tipo) {
        super(id, nome, cpf, idade);
        this.tipo = tipo.toUpperCase();
    }

    public String getTipo() {
        return  tipo.equals("F")? "Pessoa Fisica" : "Pessoa Juridica";
    }

    @Override
    public String toString() {
        return "Cliente{" + getPessoa() +"tipo='" +getTipo();
    }
}
