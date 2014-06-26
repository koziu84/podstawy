import java.math.BigInteger;

public class Funkcje {

	public static void main(String[] args) {

		int cyfra = 1;
		double liczba = 4.0;

		double pierwiastek = Math.sqrt(liczba);

		System.out.println("Pierwiastek z " + liczba + " wynosi: " + pierwiastek);

		BigInteger aInt = BigInteger.valueOf(2141341);
		System.out.println(aInt.toString());

		// zadanie 1

		int a = -2;
		int b = 4;

		System.out.println(Math.pow(a, b));
		System.out.println(Math.abs(a));
		System.out.println(Math.sqrt(Math.pow(a, b)));

		// zadanie 2

		BigInteger bInt = new BigInteger("283452895634780329");
		BigInteger cInt = new BigInteger("423438927543894873");

		System.out.println(bInt.add(cInt));
		System.out.println(bInt.divide(cInt));
		System.out.println(bInt.multiply(cInt));
		System.out.println(bInt.pow(b));
		System.out.println(bInt.abs());

	}
}
