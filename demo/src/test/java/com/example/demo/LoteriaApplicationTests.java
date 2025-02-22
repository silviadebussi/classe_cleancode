package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.Loteria;


public class LoteriaApplicationTests {

    @Test
    public void testGerarNumerosAleatorios_TamanhoEIntervalo() {
        List<Integer> numerosSorteados = Loteria.gerarNumerosAleatorios();
        assertEquals(6, numerosSorteados.size(), "A lista deve conter exatamente 6 números.");

        long quantidadeDistintos = numerosSorteados.stream().distinct().count();
        assertEquals(6, quantidadeDistintos, "Todos os números devem ser únicos.");

        for (int num : numerosSorteados) {
            assertTrue(num >= 1 && num <= 60, "Cada número deve estar entre 1 e 60.");
        }
    }

    @Test
    public void testContarAcertos() {

        List<Integer> aposta = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> sorteados = List.of(4, 5, 6, 7, 8, 9);


        int acertos = Loteria.contarAcertos(aposta, sorteados);
        assertEquals(3, acertos, "A contagem de acertos deve ser 3.");
    }

    @Test
    public void testCalcularPremio() {
        double valorAposta = 10.0;


        double premio4 = Loteria.calcularPremio(4, valorAposta);
        assertEquals(20.0, premio4, "Para 4 acertos, o prêmio deve ser 10 * 2 = 20.");


        double premio5 = Loteria.calcularPremio(5, valorAposta);
        assertEquals(50.0, premio5, "Para 5 acertos, o prêmio deve ser 10 * 5 = 50.");


        double premio6 = Loteria.calcularPremio(6, valorAposta);
        assertEquals(100.0, premio6, "Para 6 acertos, o prêmio deve ser 10 * 10 = 100.");


        double premio3 = Loteria.calcularPremio(3, valorAposta);
        assertEquals(0.0, premio3, "Para acertos diferentes de 4, 5 ou 6, o prêmio deve ser 0.");
    }
}
