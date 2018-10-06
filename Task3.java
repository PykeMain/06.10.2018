package edu.school.maina;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int m= input.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i=0; i<n; i++){
			arr1[i]=input.nextInt();
		}
		for(int i=0; i<m; i++){
			arr2[i]=input.nextInt();
		}
		for(int array1=0; array1<n; array1++){
			for(int array2=0; array2<m; array2++){
				if(arr1[array1]==arr2[array2]){
					System.out.println(arr1[array1]);
					array2=m;
				}
			}
		}
	}

}
