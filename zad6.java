import java.util.*;

public class zad6 {
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
		
		int amount = 0;
		int [] wyniki = new int [liczby.length];
		wyniki[0] = liczby[0];
		int count = 1;
		for (int i=1 ; i<liczby.length ; i++) {
			if (liczby[i]==liczby[i-1]) {
				count++;
			}
			else {
				if (count >= 3) {
					wyniki[amount] = liczby[i-1];
					amount++;
				}
				count = 1;
			}
		}
		
		String answer = "";
		for (int i=0 ; i<amount-1 ; i++)  {
			answer += String.valueOf(wyniki[i]) + ", ";
		}
		answer += String.valueOf(wyniki[amount-1]);
		
		System.out.println(answer);
	}
}
