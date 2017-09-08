
public class zad13 {
	public static void main(String[] args) {
		
		int max = 0;
		String answer = "";
		for (int i=2 ; i<=10000 ; i++) {
			if (testDzielnikow(i)>max) {
				answer = String.valueOf(i);
				max = testDzielnikow(i);
			}
			else if (testDzielnikow(i)==max) {
				answer += ", " + String.valueOf(i);
			}
		}
		
		System.out.println(answer);
	}

	private static int testDzielnikow(int liczba) {
		
		int limit = liczba;
		int count = 2;
		
		for (int i=2 ; i<limit ; i++) {
			if (liczba%i==0) {
				if (i==liczba/i) {
					count++;
				}
				else {
					count += 2;
				}
				limit = liczba/i;
			}
		}
		
		return count;
	}
}
