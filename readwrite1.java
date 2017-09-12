import java.util.*;

public class readwrite1 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int a = czytaj.nextInt();
		int b = czytaj.nextInt();
		int c = czytaj.nextInt();
		czytaj.close();
		
		System.out.println(String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c));
		System.out.println(String.valueOf(c) + " " + String.valueOf(b) + " " + String.valueOf(a));
		
	}
}
