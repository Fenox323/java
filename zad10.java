import java.util.*;

public class zad10 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		String liczba = czytaj.nextLine();
		czytaj.close();
		
		int wynik = 0;
		for (int i=0 ; i<liczba.length() ; i++) {
			wynik += Integer.valueOf(String.valueOf(liczba.charAt(i)));
		}
		
		System.out.println(String.valueOf(wynik));
	}
}
