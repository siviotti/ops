package siviotti.ops.example.cc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sorveteria3Test {
	
	private Sorveteria3 sorveteria;

	@Before
	public void before() {
		sorveteria = new Sorveteria3();
	}

	@Test
	public void testAllCircuits() {
		// Fluxo Principal
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(23, sorveteria.precoSorvete(true, true, 1)); // Premium-Copinho-1Cob
		assertEquals(21, sorveteria.precoSorvete(true, false, 2)); // Premium-Casquinha-1Cob
		assertEquals(24, sorveteria.precoSorvete(true, true, 2)); // Premium-Copinho-2Cob
	}

}
