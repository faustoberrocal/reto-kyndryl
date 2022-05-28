package com.fausto.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import com.fausto.service.SumaService;
import com.fausto.entity.Suma;

@SpringBootTest
class ServiceTest {

	@Autowired
	SumaService sumaService;
	
	@DisplayName("Insertara la suma a la Base de Datos")
	@Test
    public void testSumar() {
        Integer sum01 = 10;
        Integer sum02 = 20;
        int filasAfectadas = sumaService.insertSuma(new Suma(sum01, sum02, (sum01 + sum02)));
        assertThat(filasAfectadas).isNotEqualTo(0);
    }
}
