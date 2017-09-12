import java.util.Scanner;

public class zad3 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner(System.in);
		String kod = czytaj.nextLine();
		czytaj.close();
		
		if (kod.length()!=6) {
			System.out.println(false);
		}
		else {
			for (int i=0 ; i<6; i++) {
				if (i==2) {
					if (kod.charAt(i)!='-') {
						System.out.println(false);
						break;
					}
				}
				else {
					if (!Character.isDigit(kod.charAt(i))) {
						System.out.println(false);
						break;
					}
				}
				if (i==5) {
					System.out.println(true);
				}
			}
		}
	}
}
