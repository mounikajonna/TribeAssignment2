package TribeAssignment2;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number " );
	int fact = sc.nextInt();
	
	System.out.println("Enter the Number fact" );
	int n = sc.nextInt();
	
	
	for (int i=1;i<=n;i++) {
		fact=fact*i;
		
		System.out.println(fact);
		
	}
}
}
