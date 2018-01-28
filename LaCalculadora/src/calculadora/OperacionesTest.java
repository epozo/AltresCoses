package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacionesTest {

	@Test
	public void testSuma() {
		Operaciones op = new Operaciones();
		int res = Operaciones.suma(20, 10);
		assertEquals(30, res);
	//	fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivisio() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirEnter() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisualitzar() {
		fail("Not yet implemented");
	}

}
