package com.estudo.defaultMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Revisão Java*/
public class JavaOito {

    public static void main(String[] args){
        List<String> palavras = new ArrayList<>();
        palavras.add("amburguer");
        palavras.add("dedo");
        palavras.add("casa");
        palavras.add("agua");

        System.out.println(palavras);

        System.out.println("Utilizando Collecttions Sort - ordenando em ordem alfabetica");
        Collections.sort(palavras);
        System.out.println(palavras);

        System.out.println("Utilizando Comparator");
        Comparator<String> comparar = new ComparaPorTamanho();
        Collections.sort(palavras,comparar);

        System.out.println(palavras);

    }

    public static class ComparaPorTamanho implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            /*
            *"amburguer" ,"dedo"
            * Lógica: a primeira palavra é menor que é a segunda ? se sim retorna o valor negatio
            * se não  verifica se é maior , se for retorna o valor positivo, caso as duas
            * condições anteriores forem iguais retorne 0
            * */
            if(o1.length() < o2.length()){
                return -1;
            }
            if(o1.length() > o2.length()){
                return 1;
            }
            return 0;
        }
    }


}
