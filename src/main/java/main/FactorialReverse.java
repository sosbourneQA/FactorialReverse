package main;

public class FactorialReverse {

	public int calculate(double factorial) {
		int i = 0;
		
		while ( factorial > 1) {
			i++;
			factorial = factorial / i;
		}
		
		if (factorial == 1) {
			return i;
		} else {
			return 0;
		}
	}
}
