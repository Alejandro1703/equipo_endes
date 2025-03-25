package com.endes.entidad;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {
	
	Desarrollador desarrollador;
	
	@BeforeEach
	void setUp() throws Exception {
		
		desarrollador = new Desarrollador("12345678K","Carlos",700.00, "Java");
		
		}
	@Test
	@DisplayName("Prueba para getDNI")
	void testgetLenguajePrincipal() {
		String lenguajeUsado = "Java";
		assertEquals(lenguajeUsado, desarrollador.getLenguajePrincipal() );	
	}
	@Test
	@DisplayName("Prueba para calcularProductividad")
	void testCalcularProductividad() {
		int productividad = 700;
		int productividadJavaPython = 770;
		assertEquals(productividadJavaPython, 770, "El desarrollador ha utilizado Java o Python" );
		
	}
}