package junit5_test.simplemavenapp;

public class Calculator {

	private String lastResult;
	
	public String getLastResult() {
		return lastResult;
	}

	public double sum(double a, double b) {
		double result = a + b;
		lastResult = Double.toString(result);
		return result;
	}
	
}

