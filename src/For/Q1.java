package For;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
				
		N = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}
	}

}
