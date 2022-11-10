package testing.calculator.myCalculator.myCalculatorImpl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import testing.calculator.myCalculator.serviceImpl.myCalculatorServiceImpl;

@Test
public class myCalculatorImpl {
	myCalculatorServiceImpl service = new myCalculatorServiceImpl();
	
	public void add_succes() {
		assertEquals(service.add(new int[] {1,2,3,4,5}), 15);
	}
	
	public void add_fail() {
		assertNotEquals(service.add(new int[] {1,2,3,4,5}),10);
	}
}
