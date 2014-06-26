import java.util.Scanner;

public class Wejscie {

	public static void main(String[] args) {

		double a;
		double b;

		Scanner odczyt = new Scanner(System.in);

		System.out.println("Podaj pierwszą liczbę:");
		a = odczyt.nextDouble();
		System.out.println("Podaj drugą liczbę:");
		b = odczyt.nextDouble();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();

	}
}
