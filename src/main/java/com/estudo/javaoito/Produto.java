package com.estudo.javaoito;

import java.math.BigDecimal;

public class Produto {

    private long codigoInterno;
    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;

    public Produto(long codigoInterno, String nome, BigDecimal preco) {
        this.codigoInterno = codigoInterno;
        this.nome = nome;
        this.preco = preco;
    }

    public long getCodigoInterno() {
        return codigoInterno;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String listarProdutos(){
        return "Produto{" +
                "codigoInterno=" + codigoInterno +
                ", nome='" + nome + '\'' +
                ", preco=" + preco.setScale(2) +
                '}';
    }
    @Override
    public String toString() {
        return "Produto{" +
                "codigoInterno=" + codigoInterno +
                ", nome='" + nome + '\'' +
                ", preco=" + preco.setScale(2)+
                '}';
    }

}
