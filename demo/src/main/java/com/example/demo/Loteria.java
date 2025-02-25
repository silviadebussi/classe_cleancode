package com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Loteria {

    private static final int quantidadeNumeros = 6;

    public static List<Integer> gerarNumerosAleatorios() {
        Random random = new Random();
        List<Integer> numerosSorteados = new ArrayList<>();

        while (numerosSorteados.size() < quantidadeNumeros) {
            int numero = random.nextInt(60) + 1;
            if (!numerosSorteados.contains(numero)) {
                numerosSorteados.add(numero);
            }
        }
        return numerosSorteados;
    }

    public static int contarAcertos(List<Integer> aposta, List<Integer> sorteados) {
        int acertos = 0;
        for (int numero : aposta) {
            if (sorteados.contains(numero)) {
                acertos++;
            }
        }
        return acertos;
    }

    public static double calcularPremio(int acertos, double valor) {
        if (acertos == 6) {
            return valor * 10;
        } else if (acertos == 5) {
            return valor * 5;
        } else if (acertos == 4) {
            return valor * 2;
        }
        return 0.0;
    }
}
