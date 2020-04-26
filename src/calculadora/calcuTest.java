package calculadora;

import org.junit.jupiter.api.Test;

class calcuTest {

	@Test
	public void testSuma () {
		int resultado = calculadora.suma(2,3);		
		int esperado = 5;
		
		if(esperado == resultado) {
			System.out.println("lo justo");
		};
	}
	
	@Test
	public void testResta () {

		int resultado = calculadora.resta(2,3);		
		int esperado = 5;
		if(esperado != resultado) {
			System.out.println("lo jussssssto2");
		};
	
	}
}
