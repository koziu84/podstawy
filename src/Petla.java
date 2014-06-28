import java.util.Scanner;

public class Petla {
	public static void main(final String[] args) {
		// int licznik = 0;
		//
		// while (licznik < 10) {
		// System.out.println("To jest petla");
		// System.out.println(licznik);
		// licznik++;
		// }
		// System.out.println("Koniec pętli");

		System.out.println("Podaj liczbę: ");
		final Scanner sc = new Scanner(System.in);
		int liczba = sc.nextInt();
		if (liczba > 0) {
			for (int i = liczba; i >= 0; i--) {
				System.out.println("Bomba wybuchnie za " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
			}
			System.out.println("BOOM!");
			int a = liczba;
			do {
				System.out.println("Bomba wybuchnie za " + a);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
				a--;
			} while (a >= 0);
			System.out.println("BOOM!");
			a = liczba;
			while (a >= 0) {
				System.out.println("Bomba wybuchnie za " + a);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
				a--;
			}
			System.out.println("BOOM!");
		} else {
			System.out.println("To liczba ujemna!");
		}
		sc.close();

	}
}