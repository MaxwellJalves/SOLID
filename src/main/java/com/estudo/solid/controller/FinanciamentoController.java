package com.estudo.solid.controller;

import com.estudo.solid.entity.TipoFinanciamento;
import com.estudo.solid.entity.Cliente;
import com.estudo.solid.entity.Financiamento;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("financiamentos")
public class FinanciamentoController {

    @GetMapping
    public ResponseEntity<List<String>> listar(){
        Cliente cli = new Cliente(100,"Maxwell","254.548.548-54",31,"f");
        Cliente cli2 = new Cliente(120,"MERCADINHO ESPERANCA","252.252.000/0001-25",60,"J");
        Cliente cli3 = new Cliente(135,"JOSEFA CLAUDINA","999.548.548-54",74,"F");

        List<Financiamento> solicitacoes = new ArrayList<>();
        solicitacoes.add(new Financiamento(cli,TipoFinanciamento.MOTOCICLETA));
        solicitacoes.add(new Financiamento(cli2,TipoFinanciamento.IMOBILIARIO));
        solicitacoes.add(new Financiamento(cli3,TipoFinanciamento.AUTOMOVEL));
        //Pendente de Implementar o Solid -> convertendo listar de financiamento em lista de String
        List<String> convert = Collections.singletonList(solicitacoes.toString());

        return ResponseEntity.ok().body(convert);
    }
}
