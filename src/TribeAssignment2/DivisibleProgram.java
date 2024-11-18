package TribeAssignment2;

import java.util.Scanner;

public class DivisibleProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The Range starts from ");
	int start = sc.nextInt();
	System.out.println("The Range ends for ");
	int end = sc.nextInt();
	for(int i=start;i<=end;i++) {
		if(i % 7==0 && i % 5 !=0) {
			System.out.println(i);
		}
	}
}
}
