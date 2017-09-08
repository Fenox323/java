import java.util.*;

public class zad12 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int liczba = czytaj.nextInt();
		czytaj.close();
		
		System.out.println(testDzielnikow(liczba));
	}

	private static String testDzielnikow(int liczba) {
		
		String wynik = "1" + ", " + String.valueOf(liczba);
		int limit = liczba;
		
		for (int i=2 ; i<limit ; i++) {
			if (liczba%i==0) {
				if (i==liczba/i) {
					wynik += ", " + String.valueOf(i);
				}
				else {
					wynik += ", " + String.valueOf(i) + ", " + String.valueOf(liczba/i);
				}
				limit = liczba/i;
			}
		}
		
		return wynik;
	}
}
