package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class ValidadorAposta {

    private static final int MIN_VALOR = 1;
    private static final int MAX_VALOR = 60;
    private static final int MIN_TAMANHO = 6;
    private static final int MAX_TAMANHO = 15;

    public static boolean validarNumeros(List<Integer> numeros) {
        if (numeros.size() < MIN_TAMANHO || numeros.size() > MAX_TAMANHO) {
            return false;
        }

        List<Integer> unicos = new ArrayList<>();
        for (int numero : numeros) {
            if (numero < MIN_VALOR || numero > MAX_VALOR || unicos.contains(numero)) {
                return false;
            }
            unicos.add(numero);
        }
        return true;
    }
}


