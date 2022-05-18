package com.fca.calidad.unittest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {

	public Calculadora miCalculadora;
	
	@Before
	public void setUp() throws Exception {
		miCalculadora= new Calculadora();
	}

	

	@Test
	public void sumaTest() {
		
		//Ejercicio, llamada del cpdigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1, 3);
		double resultadoEsperado = 4;
		
		//Verificación, comparar resuladoEjecución con resultadoEsperado
		
		assertThat(resultadoEjecucion, is (resultadoEsperado));
	}

	
}
