import java.util.*;

public class metodos {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		String input = s.nextLine();
		int a = Integer.parseInt(input);
		input = s.nextLine();
		int b = Integer.parseInt(input);
		System.out.println(simar(a,b));
	}
 
	public static int simar (int a, int b) {
		return (a+b);
	}
}
