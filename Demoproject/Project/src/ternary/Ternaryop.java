package ternary;
import java.util.Scanner;

public class Ternaryop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter two integer");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		int min = n1 > n2 ? n2 : n1;
		int max = n1 > n2 ? n1 : n2;
		
		System.out.println("Min= " + min + "Max= " + max);

	}

}
