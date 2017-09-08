import java.util.*;

public class zad8 {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		System.out.println("liczby:");
		String input = czytaj.nextLine();
		System.out.println("rotacja:");
		int K = Integer.valueOf(czytaj.nextLine());
		czytaj.close();
		
		String [] inputSplit = input.split(" ");
		int [] liczby = new int [inputSplit.length];
		for (int i=0 ; i<inputSplit.length ; i++) {
			liczby[i] = Integer.valueOf(inputSplit[i]);
		}
		int N = liczby.length;
		
		K = K % N;
		
		for (int i=0 ; i<K ; i++) {
			int temp = liczby[0];
			int temp2;
			for (int j=0 ; j<N-1 ; j++) {
				temp2 = liczby[j+1];
				liczby[j+1] = temp;
				temp = temp2;
			}
			liczby[0] = temp;
		}
		
		String answer = "";
		for (int i=0 ; i<N-1 ; i++)  {
			answer += String.valueOf(liczby[i]) + ", ";
		}
		answer += String.valueOf(liczby[N-1]);
		
		System.out.println(answer);
	}
}
