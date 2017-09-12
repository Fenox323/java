import java.util.*;

public class Choinka {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int N = czytaj.nextInt();
		czytaj.close();
		
		for (int i=0 ; i<N ; i++) {
			String out = "";
			for (int j=i ; j<N ; j++) {
				out += " ";
			}
			for (int j=0 ; j<(i*2)+1 ; j++) {
				out += "*";
			}
			System.out.println(out);
		}
		for (int i=0 ; i<N+1 ; i++) {
			String out = "";
			for (int j=i ; j<N ; j++) {
				out += " ";
			}
			for (int j=0 ; j<(i*2)+1 ; j++) {
				out += "*";
			}
			System.out.println(out);
		}
		String out = "";
		for (int i=0 ; i<N ; i++) {
			out += " ";
		}
		System.out.println(out + "*" + '\n' + out + "*");
	}
}
