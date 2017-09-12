import java.util.Scanner;


public class zad1 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		String imie = czytaj.nextLine();
		String imie2 = "";
		
		for (int i=imie.length()-1 ; i>=0 ; i--) {
			imie2 += imie.charAt(i);
		}
		System.out.println(test(imie, imie2));
		
		czytaj.close();
	}
	public static boolean test (String imie, String imie2) {
		if (imie.equalsIgnoreCase(imie2)) return true;
		else return false;
	}
}
