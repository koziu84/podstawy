import java.util.Scanner;

public class Tablica {

	public static void main(final String[] args) {

		String[] imiona = new String[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Podaj " + (i + 1) + " imię: ");
			imiona[i] = input.next();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Witaj " + imiona[i]);
		}
		input.close();

	}
}
