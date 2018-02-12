package firstwar;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;



public class CalculatorTest {
	
	Calculator calc = null;
	@Mock
	CalculatorService service ;
	
	
	@Before
	public void setup() {
	calc = new Calculator(service);
	}
	
	@Test
	public void testPerform()
	{
		
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10, calc.perform(2, 3));
		verify(service.add(2, 3));
	}
	
	@After
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
