package TribeAssignment2;

import java.util.Scanner;

public class GreatestSmallest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ");
	int s1 = sc.nextInt();
	int s2 = sc.nextInt();
	int s3 = sc.nextInt();
	//greatest
	if(s1>s2 && s1>s3) {
		System.out.println("The greatest value is:"+s1);	
	}
	else if(s2>s3) {
		System.out.println("The greatest value is:"+s2);
	}
	else {
		System.out.println("The greatest value is:"+s3);
	}
	//smallest
	if(s1<s2 && s1<s3) {
		System.out.println("The smallest value is:"+s1);	
	}
	else if(s2<s3) {
		System.out.println("The smallest value is:"+s2);
	}
	else {
		System.out.println("The smallest value is:"+s3);
	}
	
	
}
}
