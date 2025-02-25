package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ValidadosApostaApplicationsTests {

    @Test
    void testApostaDentroDosLimites() {
        List<Integer> numerosValidos = Arrays.asList(5, 10, 15, 20, 25, 30);
        assertTrue(ValidadorAposta.validarNumeros(numerosValidos));
    }

    @Test
    void testApostaComMenosNumerosQuePermitido() {
        List<Integer> numerosInvalidos = Arrays.asList(5, 10, 15);
        assertFalse(ValidadorAposta.validarNumeros(numerosInvalidos));
    }

    @Test
    void testApostaComMaisNumerosQuePermitido() {
        List<Integer> numerosInvalidos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertFalse(ValidadorAposta.validarNumeros(numerosInvalidos));
    }

    @Test
    void testApostaComNumeroInvalido() {
        List<Integer> numerosInvalidos = Arrays.asList(0, 10, 15, 20, 25, 30);
        assertFalse(ValidadorAposta.validarNumeros(numerosInvalidos));
    }

    @Test
    void testApostaComNumerosRepetidos() {
        List<Integer> numerosInvalidos = Arrays.asList(5, 10, 15, 20, 25, 25);
        assertFalse(ValidadorAposta.validarNumeros(numerosInvalidos));
    }
}