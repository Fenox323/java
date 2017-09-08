import java.util.*;

public class zad7 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		String input = czytaj.nextLine();
		czytaj.close();
		
		String [] inputSplit = input.split(" ");
		int [] liczby = new int [inputSplit.length];
		for (int i=0 ; i<inputSplit.length ; i++) {
			liczby[i] = Integer.valueOf(inputSplit[i]);
		}
		
		for (int i=0 ; i<liczby.length ; i++) {
			liczby[i] = liczby[i]%37;
		}
		Arrays.sort(liczby);
		
		int count = 1;
		for (int i=1 ; i<liczby.length ; i++) {
			if (liczby[i]!=liczby[i-1]) {
				count++;
			}
		}
		
		System.out.println(String.valueOf(count));
	}
}
