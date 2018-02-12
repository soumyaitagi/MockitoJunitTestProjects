package firstwar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Sample1Test {

	Sample1 sam = new Sample1();
	@Test
	public void testsum()
	{
		assertEquals(14, sam.sum(new int[] {3,5,6}));
		System.out.println(Integer.MIN_VALUE);
	}
	
}
