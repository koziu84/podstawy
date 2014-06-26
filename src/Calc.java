public class Calc {

	public static void main(final String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;
		System.out.println((a + b) * c);
		System.out.println(a - (b / c));
		// a++;
		b++;
		c++;
		System.out.println((a + b) > c);
		System.out.println(a == b);
	}
}
