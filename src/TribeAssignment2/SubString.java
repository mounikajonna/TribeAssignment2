package TribeAssignment2;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i= {3,6,4,8,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		
		
		int[] result = sumOfStrings(i, n);

        if (result.length == 2) {
            System.out.println("Subarray found from index " + result[0] + " to index " + result[1]);
        } else {
            System.out.println("No subarray found with the given sum.");
        }
		
	
	}
	public static int[] sumOfStrings(int[] array,int n) {
		int len = array.length;
		int sum;
		for(int i=0;i<len;i++) {
			sum=array[i];
			for(int j=i+1;j<=len;j++) {
				if(sum==n) {
					return new int[] {i,j-1};
					
					}
				
				if(sum>n) {
					break;
				}
				if(j<len) {
					sum = sum+array[j];
				}
			}
			
		}
		return new int[] {};  
}
}