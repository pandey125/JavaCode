package projectdemo;
import java.util.Scanner;

public class Maxclass {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any two number");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("Max = "+max);

	}

}
