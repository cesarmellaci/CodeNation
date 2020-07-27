package Util;

public class ConversaoMoeda {
	
	public static double valorPagar(double dolar, double valorMoeda) {
		return (dolar * valorMoeda) + ((dolar * valorMoeda) * 6 / 100);
	}
}
