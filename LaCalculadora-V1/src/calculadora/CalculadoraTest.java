package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest {

	private int num1;
	private int num2;
	private int resul;
	
	public CalculadoraTest (int num1, int num2, int resul) {
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{20, 10, 2},
			{30, -2, -15},
			{5, 2, 3}
		});
		
	}
	@Test
	public void testdivisio() {
		int res = Calculadora.divisio(num1,  num2);
		assertEquals(resul,  res);
	//	fail("Not yet implemented");
	}
	
/*	@Test
	public void testSuma() {
		int res = Calculadora.suma(10,  20);
		assertEquals(30,  res);
	//	fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		int res = Calculadora.resta(10,  20);
		assertEquals(-10,  res);
	//	fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacio() {
		int res = Calculadora.multiplicacio(10,  20);
		assertEquals(200,  res);
	//	fail("Not yet implemented");
	}

	@Test (expected = java.lang.ArithmeticException.class)
	public void testDivisio() {
		int res = Calculadora.divisio(10, 0);
		assertEquals("Ha fallado el método divisió", 2,  res);
		//Al poner el comentario en assertEquals, si no coincide el resultado se provoca un fallo con el mensaje que hayamos puesto		
	//	fail("Not yet implemented");
	}
	
	@Test
	public void testException() {
		int res;
		
		try {
			res = Calculadora.divisio(10, 0);
			fail("Fallo: Pasa por aquí si no se lanza la excepción ArithmeticException");
		}
		catch (ArithmeticException e) {
			//La prueba funciona orrectamente
		}
	}
*/
}
