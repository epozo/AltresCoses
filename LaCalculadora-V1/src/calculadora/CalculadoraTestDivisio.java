package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
@RunWith(Parameterized.class)
public class CalculadoraTestDivisio {

		private int num1;
		private int num2;
		private int resul;
		
		public CalculadoraTestDivisio (int num1, int num2, int resul) {
			this.num1 = num1;
			this.num2 = num2;
			this.resul = resul;
		}
		
		@Parameters
		public static Collection<Object[]> numeros() {
			return Arrays.asList(new Object[][] {
				{20, 10, 2},
				{30, -2, -15},
				{5, 2, 2}
			});
			
		}
		@Test
		public void testdivisio() {
			int res = Calculadora.divisio(num1,  num2);
			assertEquals(resul,  res);
		//	fail("Not yet implemented");
		}
}
