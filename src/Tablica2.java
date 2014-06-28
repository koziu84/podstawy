import java.util.Scanner;

public class Tablica2 {

	public static void main(final String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wielkość tablicy: ");
		int n = sc.nextInt();
		int[] tab = new int[n];

		for (int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
		}
		int licznik = 0;
		while (licznik < tab.length) {
			System.out.print(tab[licznik] + " ");
			licznik++;
		}
		sc.close();
	}
}
