import java.util.Scanner;

public class zad4 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		String slowo = czytaj.nextLine();
		czytaj.close();
		int count = 0;
		
		for (int i=0 ; i<slowo.length(); i++) {
			char lit = slowo.charAt(i);
			if (Character.isLowerCase(lit)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
