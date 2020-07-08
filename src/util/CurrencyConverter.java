package util;

public class CurrencyConverter {
	
	public static final double percent = 0.06;
	
	public static double convert(double price, double money) {
		return (money * price) * percent + money * price;
	}
}
