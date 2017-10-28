package siviotti.ops.example.cc;

import static org.junit.Assert.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ConstCounter2Test {
	
	private ConstCounter2 obj;
	
	@Before
	public void before(){
		obj = new ConstCounter2();
	}


	@Test
	public void testBooleanFields(){
		assertEquals(-1, obj.countIntConsts(null));
		assertEquals(-1, obj.countIntConsts(List.class));
		assertEquals(-1, obj.countIntConsts(Month.class));
		
		assertEquals(0, obj.countIntConsts(Object.class));
		
		assertEquals(4, obj.countIntConsts(ArrayList.class));
		
			
		
	}

}
