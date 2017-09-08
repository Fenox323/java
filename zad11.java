import java.util.*;

public class zad11 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int liczba = czytaj.nextInt();
		czytaj.close();
		
		System.out.println(testPierwszosci(liczba));
	}

	private static boolean testPierwszosci(int liczba) {
		
		double limit = Math.sqrt(liczba);
		for (int i=2 ; i<=limit ; i++) {
			if (liczba%i == 0) return false;
		}
		return true;
	}
}
