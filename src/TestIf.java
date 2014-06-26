import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {

		// System.out.println("Pierwsza liczba: ");
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		//
		// System.out.println("Druga liczba: ");
		// int b = sc.nextInt();
		//
		// sc.close();
		//
		// if (a == b) {
		// System.out.println("Liczby równe");
		// } else {
		// System.out.println("Liczby nierówne");
		// }

		System.out.println("Podaj imie: ");
		Scanner sc = new Scanner(System.in);
		String imie = sc.next();

		switch (imie) {
		case "marek":
			System.out.println("Imie to Marek");
			break;
		case "jacek":
			System.out.println("Imie to Jacek");
		case "michal":
			System.out.println("Imie to Michal");
		default:
			System.out.println("Zadne imie");
		}

	}

}
