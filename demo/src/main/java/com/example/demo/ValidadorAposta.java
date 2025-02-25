package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class ValidadorAposta {

    private static final int minValor = 1;
    private static final int maxValor = 60;
    private static final int minTamanho = 6;
    private static final int maxTamanho = 15;

    public static boolean validarNumeros(List<Integer> numeros) {
        if (numeros.size() < minTamanho || numeros.size() > maxTamanho) {
            return false;
        }

        List<Integer> numerosUnicos = new ArrayList<>();
        for (int numero : numeros) {
            if (numero < minValor || numero > maxValor || numerosUnicos.contains(numero)) {
                return false;
            }
            numerosUnicos.add(numero);
        }
        return true;
    }
}
