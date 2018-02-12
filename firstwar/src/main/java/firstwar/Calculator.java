package firstwar;

public class Calculator {
	
	
	CalculatorService service;
	
	public Calculator(CalculatorService service2) {
		service = service2;
	}

	public int perform(int i, int j)
	{
		return service.add(i, j)*i;
	}

}
