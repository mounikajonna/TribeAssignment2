package TribeAssignment2;

import java.util.Scanner;

public class SwitchProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ");
	int i = sc.nextInt();
	String grade;
    if (i >= 91) {
        grade = "A";
    } 
    else if (i >= 81) {
        grade = "B";
    } 
    else if (i >= 36) {
        grade = "C";
    }
    else  {
            grade = "D";
    } 
    
    
    switch (grade) {
        case "A":
            System.out.println("The grade is A-Excellent");
            break;
        case "B":
            System.out.println("The grade is B-Good");
            break;
        case "C":
            System.out.println("The grade is C-Medium");
            break;
        case "D":
            System.out.println("The grade is D-Fail");
            break;
        default:
            System.out.println("Invalid grade");
            break;
    }
}

	}


	

