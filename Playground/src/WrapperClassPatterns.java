import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WrapperClassPatterns {
	
	@Test
	public final void testMath() {
		
//		Math's constructor is private, so you can't call it.
//		All its methods are static. It is final, so you can't subclass it.
		
		assertEquals(5, Math.abs(-5));
		assertEquals(3, Math.floor(3.39), .001);
		assertEquals(4, Math.ceil(3.39), .001);
		assertEquals(87, Math.max(76, 87));
		assertEquals(97, Math.min(97, 102));
		assertEquals(25, Math.pow(5, 2), .001);
		assertEquals(6, Math.round(5.98786775), .001);
		assertEquals(1, Math.copySign(-1, 2), .001);
		assertEquals(0, Math.IEEEremainder(10, 2), .001);
		assertEquals(2.2, Math.sqrt(5), .1);
	}
	
	
	@Test
	public final void testParse() {
		
//		These are static so you can use them without making new objects.
		
		assertEquals(Integer.parseInt("15"), 15);
		assertEquals(Long.parseLong("1598987"), 1598987, .001);
		assertEquals(Double.parseDouble("5887.9889787878"), 5887.9889787878, .001);
	}
	
	@Test
	public final void testSystem() {
		
		System.out.println("User account name: " + System.getProperty("user.name"));
		System.out.println("OS: " + System.getProperty("os.name"));
		System.out.println("OS: " + System.getProperty("os.version"));
		
	}
	
	@Test
	public final void testSysTime() {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.println(Math.pow(5, i));
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Execution time: " + (endTime - startTime));
		
	}

}
