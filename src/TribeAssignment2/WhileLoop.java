package TribeAssignment2;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	//while loop
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element");
	int s1 = sc.nextInt();
	
	while(s1<=8) {
		System.out.println(s1);
		s1++;
	}
	//do-while loop
	
	System.out.println("Enter the element");
	int s2 = sc.nextInt();
	
	do {
		System.out.println(s2);
		s2++;
	}
	while(s2<=8);
}
}
