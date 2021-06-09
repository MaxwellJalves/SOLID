package com.estudo.solid.entity.rh;

public class Gerente extends Funcionario{

    public Gerente(long matricula, String nome, Departamento departamento, Funcao funcao) {
        super(matricula, nome, departamento, funcao);

    }
    //validando a lógica de composição e herança
    public static void main(String[] args){
        Gerente g = new Gerente(102030l,"Maxwell Jeronimo",Departamento.TI,Funcao.GERENTE);
        System.out.println(g);
    }


}

