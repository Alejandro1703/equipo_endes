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
	void testgetLenguajeJava() {
		String lenguajeUsado = "Java";
		assertEquals(lenguajeUsado, desarrollador.getLenguajePrincipal() );	
	}
	void testLenguajePython() {
		String lenguajeUsado2 = "Python";
		assertEquals(lenguajeUsado2, desarrollador.getLenguajePrincipal() );

	}
}