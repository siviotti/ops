package siviotti.ops.example.cc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Sorveteria2Test {

	private Sorveteria2 sorveteria;

	@Before
	public void before() {
		sorveteria = new Sorveteria2();
	}

	@Test
	public void testAllCircuits() {
		// Fluxo Principal
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(18, sorveteria.precoSorvete(true, true, 2)); // Comum-Copinho-2Cob
	}

}
