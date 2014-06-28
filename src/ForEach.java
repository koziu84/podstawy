public class ForEach {

	public static void main(final String[] args) {
		int[] tablica = new int[10];
		for (int i = 0; i < 10; i++) {
			tablica[i] = i + 1;
		}

		for (int x : tablica) {
			System.out.println(x);
		}
	}

}
