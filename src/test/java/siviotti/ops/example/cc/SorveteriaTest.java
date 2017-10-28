package siviotti.ops.example.cc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SorveteriaTest {

	private Sorveteria sorveteria;

	@Before
	public void before() {
		sorveteria = new Sorveteria();
	}

	//@Test
	public void testAllPaths() {
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, false, 2)); // Comum-Copinho-2Cob
		assertEquals(18, sorveteria.precoSorvete(false, true, 1)); // Comum-Casquinha-1Cob
		assertEquals(19, sorveteria.precoSorvete(false, true, 2)); // Comum-Casquinha-2Cob

		assertEquals(22, sorveteria.precoSorvete(true, false, 1)); // Premium-Copinho-1Cob
		assertEquals(23, sorveteria.precoSorvete(true, false, 2)); // Premium-Copinho-2Cob
		assertEquals(23, sorveteria.precoSorvete(true, true, 1)); // Premium-Casquinha-1Cob
		assertEquals(24, sorveteria.precoSorvete(true, true, 2)); // Premium-Casquinha-2Cob
	}

	@Test
	public void testAllCircuits() {
		// Fluxo Principal
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(22, sorveteria.precoSorvete(true, false, 1)); // Premium-Copinho-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, true, 1)); // Comum-Casquinha-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, false, 2)); // Comum-Copinho-2Cob
	}

}
