package com.estudo.solid.entity;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

import java.io.Serializable;

public class Financiamento {

    private Cliente cliente;
    @JsonEnumDefaultValue()
    private TipoFinanciamento tipoFinanciamento;

    public Financiamento(Cliente cliente, TipoFinanciamento tipoFinanciamento) {
        this.cliente = cliente;
        this.tipoFinanciamento = tipoFinanciamento;
    }

    @Override
    public String toString() {
        return "Financiamento{" +
                "cliente=" + cliente+
                ", tipoFinanciamento=" + tipoFinanciamento.toString() +
                '}';
    }
}
