import java.util.*;

public class trzyelementy {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int N = czytaj.nextInt();
		
		int [] liczby = new int [N];
		for (int i=0 ; i<N ; i++) {
			liczby[i] = czytaj.nextInt();
		}
		czytaj.close();
		
		Arrays.sort(liczby);
		
		boolean found = false;
		int count = 1;
		for (int i=1 ; i<liczby.length ; i++) {
			if (liczby[i]==liczby[i-1]) {
				count++;
			}
			else {
				count = 1;
			}
			if (count==3) {
				found = true;
				break;
			}
		}
		if (found) System.out.println("TAK");
		else System.out.println("NIE");
	}
}
