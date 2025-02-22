package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.Loteria;

@SpringBootTest
class LoteriaApplicationTests {

    @Test
    void testGerarNumerosAleatorios_TamanhoCorreto() {

        List<Integer> numerosSorteados = Loteria.gerarNumerosAleatorios();
        assertEquals(6, numerosSorteados.size(), "A lista deve conter 6 números.");

    }

    }