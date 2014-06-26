import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Odczyt {

	public static void main(String[] args) throws FileNotFoundException {

		File plik = new File("file.txt");

		Scanner sc = new Scanner(plik);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

		File plik2 = new File("imie.txt");
		System.out.println("Podaj swoje imię: ");
		Scanner scIn = new Scanner(System.in);
		String imie = scIn.nextLine();

		PrintWriter zapis = new PrintWriter(plik2);
		zapis.println(imie);
		zapis.close();

		System.out.println(new Scanner(plik2).nextLine());

		scIn.close();

	}

}
