import java.util.*;

public class zad9 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		String input = czytaj.nextLine();
		czytaj.close();
		
		String [] inputSplit = input.split(" ");
		int [] liczby = new int [inputSplit.length];
		for (int i=0 ; i<inputSplit.length ; i++) {
			liczby[i] = Integer.valueOf(inputSplit[i]);
		}
		
		Arrays.sort(liczby);
		
		int count = 1;
		for (int i=1 ; i<liczby.length ; i++) {
			if (liczby[i]==liczby[i-1]) {
				count++;
				if (i==liczby.length-1) {
					if (count%2==1) { System.out.println(String.valueOf(liczby[i-1])); break; }
				}
			}
			else {
				if (count%2==1) { System.out.println(String.valueOf(liczby[i-1])); break; }
				count=1;
			}
		}
	}
}
