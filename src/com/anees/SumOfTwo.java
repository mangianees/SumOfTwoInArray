package com.anees;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {2, 1, 8, 4, 7, 3};
		int val =3;
		int tempSum=0;
		String formatedStr ="";
		String finalFormatedStr="";
		boolean sumFound = false;
		for(int i=0;i<A.length -1;i++) {
			for(int j=i;j<A.length -1; j++) {
				tempSum = A[i] + A[j+1];
				if(tempSum == val) {
					formatedStr += A[i] + " + " + A[j+1] + " = " + tempSum + " , ";
					tempSum = 0;
					sumFound=true;
				}
			}
		
		}
		
		finalFormatedStr = "Target Sum " + val + "  " + formatedStr; 
		
		if(sumFound==true)
			System.out.println(finalFormatedStr.subSequence(0, finalFormatedStr.length()-2));
		else
			System.out.println("Target Sum " + val + " No 2 values sum upto " + val);
			
	}

}
