package siviotti.ops.example.cc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CyclomaticComplexityTest {
	
	private CyclomaticComplexity obj;
	
	@Before
	public void before(){
		obj = new CyclomaticComplexity();
	}

	@Test
	public void testSum() {
		assertEquals(2, obj.sum(1, 1));
	}

	@Test
	public void testSumIfNotEquals() {
		assertEquals(0, obj.sumIfNotEquals(1, 1));
		assertEquals(3, obj.sumIfNotEquals(1, 2));
	}

	@Test
	public void testSumIfNotZero() {
		assertEquals(0, obj.sumIfNotZero(1, 0));
		assertEquals(0, obj.sumIfNotZero(0, 1));
		assertEquals(2, obj.sumIfNotZero(1, 1));
	}

	@Test
	public void testSumIfNotZeroOr() {
		assertEquals(0, obj.sumIfNotZeroOr(1, 0));
		assertEquals(0, obj.sumIfNotZeroOr(0, 1));
		assertEquals(2, obj.sumIfNotZeroOr(1, 1));
	}
	
	@Test
	public void testSumFatorial() {
		assertEquals(8, obj.sumFatorial(2,3));
		assertEquals(3, obj.sumFatorial(2,0));
		assertEquals(840, obj.sumFatorial(5,6)); //120 + 720
	}

	@Test
	public void testSumFatorialNotZero() {
		assertEquals(0, obj.sumFatorialNotZero(1, 0));
		assertEquals(0, obj.sumFatorialNotZero(0, 1));
		assertEquals(8, obj.sumFatorialNotZero(2,3));
		assertEquals(840, obj.sumFatorialNotZero(5,6)); 
	}

	@Test
	public void testBissexto(){
		assertTrue(obj.isBissexto(1600)); // % 400 = 0
		assertTrue(obj.isBissexto(2004)); // % 4 = 0 && % 100 != 0
		assertFalse(obj.isBissexto(1900)); // % 100 == 0 (% 400 != 0)
		assertFalse(obj.isBissexto(2001)); 
	}
	
}
