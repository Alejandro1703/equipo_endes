package com.endes.entidad;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonalTest {

	 Personal persona1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		persona1 = new Persona1("12345678K","Carlos",700);
		
	}

	@Test
	@DisplayName("Prueba para getDNI")
	void testgetDNI() {
		String dniCorrecto = "12345678K";
		assertEquals(dniCorrecto,persona1.setDni("12345678K"),"El dni introducido es de la persona correcta");
		
	}
	
	@Test
	@DisplayName("Prueba para getNombre")
	void testgetNombre{
		String nombreEsperado = "Carlos";
		assertEquals(nombreEsperado)
	}
}
