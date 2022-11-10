package testing.calculator.myCalculator.serviceImpl;

import testing.calculator.myCalculator.service.myCalculatorService;

public class myCalculatorServiceImpl implements myCalculatorService {

	@Override
	public int add(int[] nums) {
		int sum = 0;
		for(int i: nums) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int[] num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
