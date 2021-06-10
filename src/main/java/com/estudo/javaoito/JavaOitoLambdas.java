package com.estudo.javaoito;

import javax.swing.text.html.HTMLDocument;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaOitoLambdas {

    public static void main(String[] args){

        //criar listar de produtos
        List<Produto> produto = new ArrayList<>();
        produto.add(new Produto(1010,"LEITE EM PÓ",BigDecimal.valueOf(5.58)));
        produto.add(new Produto(2030,"SABONETE LIQUIDO",BigDecimal.valueOf(5.58)));
        produto.add(new Produto(9999,"ARROZ INTEGRAL",BigDecimal.valueOf(5.58)));
        produto.add(new Produto(8545,"DETERGENTE",BigDecimal.valueOf(5.58)));
        produto.add(new Produto(2315,"AMACIANTE",BigDecimal.valueOf(5.58)));
        System.out.println(produto);



        for(Produto i : produto){
            System.out.println(i.getNome());
        }

        //lambda - Exiba apenas o código e Descrição dos procedimentos
        produto.forEach(e -> System.out.println(e.getCodigoInterno() +" || ".concat(e.getNome())));

        //Ordenação do menor para o maior
        boolean b = produto.contains("LEITE EM PÓ");
        System.out.println(b);

    }
}
