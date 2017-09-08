import java.util.*;

public class zad14 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int liczba1 = czytaj.nextInt();
		int liczba2 = czytaj.nextInt();
		czytaj.close();
		
		String [] d1 = testDzielnikow(liczba1).split(" ");
		String [] d2 = testDzielnikow(liczba2).split(" ");
		
		int [] l1 = new int [d1.length];
		int [] l2 = new int [d2.length];
		
		for (int i=0 ; i<d1.length ; i++) {
			l1[i] = Integer.valueOf(d1[i]);
		}
		for (int i=0 ; i<d2.length ; i++) {
			l2[i] = Integer.valueOf(d2[i]);
		}
		
		Arrays.sort(l1);
		Arrays.sort(l2);
		for (int i=l1.length-1 ; i>=0 ; i--) {
			if (Arrays.binarySearch(l2, l1[i])>=0) {
				System.out.println(l1[i]);
				break;
			}
		}
	}

	private static String testDzielnikow(int liczba) {
		
		String wynik = "1" + " " + String.valueOf(liczba);
		int limit = liczba;
		
		for (int i=2 ; i<limit ; i++) {
			if (liczba%i==0) {
				if (i==liczba/i) {
					wynik += " " + String.valueOf(i);
				}
				else {
					wynik += " " + String.valueOf(i) + " " + String.valueOf(liczba/i);
				}
				limit = liczba/i;
			}
		}
		
		return wynik;
	}
}
